package com.bubbleboy.modules.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.member.dao.UmsIntegrationChangeHistoryDao;
import com.bubbleboy.modules.member.dto.UmsIntegrationChangeHistoryDTO;
import com.bubbleboy.modules.member.entity.UmsIntegrationChangeHistoryEntity;
import com.bubbleboy.modules.member.service.UmsIntegrationChangeHistoryService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class UmsIntegrationChangeHistoryServiceImpl extends CrudServiceImpl<UmsIntegrationChangeHistoryDao, UmsIntegrationChangeHistoryEntity, UmsIntegrationChangeHistoryDTO> implements UmsIntegrationChangeHistoryService {

    @Override
    public QueryWrapper<UmsIntegrationChangeHistoryEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<UmsIntegrationChangeHistoryEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}