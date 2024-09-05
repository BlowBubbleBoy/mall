package com.bubbleboy.modules.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.member.dao.UmsMemberStatisticsInfoDao;
import com.bubbleboy.modules.member.dto.UmsMemberStatisticsInfoDTO;
import com.bubbleboy.modules.member.entity.UmsMemberStatisticsInfoEntity;
import com.bubbleboy.modules.member.service.UmsMemberStatisticsInfoService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class UmsMemberStatisticsInfoServiceImpl extends CrudServiceImpl<UmsMemberStatisticsInfoDao, UmsMemberStatisticsInfoEntity, UmsMemberStatisticsInfoDTO> implements UmsMemberStatisticsInfoService {

    @Override
    public QueryWrapper<UmsMemberStatisticsInfoEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<UmsMemberStatisticsInfoEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}