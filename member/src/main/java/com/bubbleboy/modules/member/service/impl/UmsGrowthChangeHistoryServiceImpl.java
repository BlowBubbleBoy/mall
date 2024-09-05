package com.bubbleboy.modules.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.member.dao.UmsGrowthChangeHistoryDao;
import com.bubbleboy.modules.member.dto.UmsGrowthChangeHistoryDTO;
import com.bubbleboy.modules.member.entity.UmsGrowthChangeHistoryEntity;
import com.bubbleboy.modules.member.service.UmsGrowthChangeHistoryService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class UmsGrowthChangeHistoryServiceImpl extends CrudServiceImpl<UmsGrowthChangeHistoryDao, UmsGrowthChangeHistoryEntity, UmsGrowthChangeHistoryDTO> implements UmsGrowthChangeHistoryService {

    @Override
    public QueryWrapper<UmsGrowthChangeHistoryEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<UmsGrowthChangeHistoryEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}