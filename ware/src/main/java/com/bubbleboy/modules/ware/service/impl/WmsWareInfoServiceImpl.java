package com.bubbleboy.modules.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.ware.dao.WmsWareInfoDao;
import com.bubbleboy.modules.ware.dto.WmsWareInfoDTO;
import com.bubbleboy.modules.ware.entity.WmsWareInfoEntity;
import com.bubbleboy.modules.ware.service.WmsWareInfoService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class WmsWareInfoServiceImpl extends CrudServiceImpl<WmsWareInfoDao, WmsWareInfoEntity, WmsWareInfoDTO> implements WmsWareInfoService {

    @Override
    public QueryWrapper<WmsWareInfoEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<WmsWareInfoEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}