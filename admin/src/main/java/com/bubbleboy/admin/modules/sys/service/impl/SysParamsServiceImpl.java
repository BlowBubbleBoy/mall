 

package com.bubbleboy.admin.modules.sys.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.bubbleboy.admin.modules.sys.dao.SysParamsDao;
import com.bubbleboy.admin.modules.sys.dto.SysParamsDTO;
import com.bubbleboy.admin.modules.sys.entity.SysParamsEntity;
import com.bubbleboy.admin.modules.sys.redis.SysParamsRedis;
import com.bubbleboy.admin.modules.sys.service.SysParamsService;
import com.bubbleboy.common.constant.Constant;
import com.bubbleboy.common.exception.ErrorCode;
import com.bubbleboy.common.exception.RenException;
import com.bubbleboy.common.page.PageData;
import com.bubbleboy.common.service.impl.BaseServiceImpl;
import com.bubbleboy.common.utils.ConvertUtils;
import com.bubbleboy.common.utils.JsonUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 参数管理
 */
@Service
@AllArgsConstructor
public class SysParamsServiceImpl extends BaseServiceImpl<SysParamsDao, SysParamsEntity> implements SysParamsService {
    private final SysParamsRedis sysParamsRedis;

    @Override
    public PageData<SysParamsDTO> page(Map<String, Object> params) {
        IPage<SysParamsEntity> page = baseDao.selectPage(
                getPage(params, Constant.CREATE_DATE, false),
                getWrapper(params)
        );

        return getPageData(page, SysParamsDTO.class);
    }

    @Override
    public List<SysParamsDTO> list(Map<String, Object> params) {
        List<SysParamsEntity> entityList = baseDao.selectList(getWrapper(params));

        return ConvertUtils.sourceToTarget(entityList, SysParamsDTO.class);
    }

    private QueryWrapper<SysParamsEntity> getWrapper(Map<String, Object> params) {
        String paramCode = (String) params.get("paramCode");

        QueryWrapper<SysParamsEntity> wrapper = new QueryWrapper<>();
        wrapper.eq("param_type", 1);
        wrapper.like(StrUtil.isNotBlank(paramCode), "param_code", paramCode);

        return wrapper;
    }

    @Override
    public SysParamsDTO get(Long id) {
        SysParamsEntity entity = baseDao.selectById(id);

        return ConvertUtils.sourceToTarget(entity, SysParamsDTO.class);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(SysParamsDTO dto) {
        SysParamsEntity entity = ConvertUtils.sourceToTarget(dto, SysParamsEntity.class);
        insert(entity);

        sysParamsRedis.set(entity.getParamCode(), entity.getParamValue());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(SysParamsDTO dto) {
        SysParamsEntity entity = ConvertUtils.sourceToTarget(dto, SysParamsEntity.class);
        updateById(entity);

        sysParamsRedis.set(entity.getParamCode(), entity.getParamValue());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Long[] ids) {
        //删除Redis数据
        List<String> paramCodeList = baseDao.getParamCodeList(ids);
        String[] paramCodes = paramCodeList.toArray(new String[paramCodeList.size()]);
        sysParamsRedis.delete(paramCodes);

        //删除
        deleteBatchIds(Arrays.asList(ids));
    }

    @Override
    public String getValue(String paramCode) {
        String paramValue = sysParamsRedis.get(paramCode);
        if (paramValue == null) {
            paramValue = baseDao.getValueByCode(paramCode);

            sysParamsRedis.set(paramCode, paramValue);
        }
        return paramValue;
    }

    @Override
    public <T> T getValueObject(String paramCode, Class<T> clazz) {
        String paramValue = getValue(paramCode);
        if (StrUtil.isNotBlank(paramValue)) {
            return JsonUtils.parseObject(paramValue, clazz);
        }

        try {
            return clazz.newInstance();
        } catch (Exception e) {
            throw new RenException(ErrorCode.PARAMS_GET_ERROR);
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateValueByCode(String paramCode, String paramValue) {
        int count = baseDao.updateValueByCode(paramCode, paramValue);
        sysParamsRedis.set(paramCode, paramValue);
        return count;
    }

}