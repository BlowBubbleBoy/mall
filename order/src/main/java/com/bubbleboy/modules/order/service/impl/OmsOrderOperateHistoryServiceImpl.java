package com.bubbleboy.modules.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.order.dao.OmsOrderOperateHistoryDao;
import com.bubbleboy.modules.order.dto.OmsOrderOperateHistoryDTO;
import com.bubbleboy.modules.order.entity.OmsOrderOperateHistoryEntity;
import com.bubbleboy.modules.order.service.OmsOrderOperateHistoryService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class OmsOrderOperateHistoryServiceImpl extends CrudServiceImpl<OmsOrderOperateHistoryDao, OmsOrderOperateHistoryEntity, OmsOrderOperateHistoryDTO> implements OmsOrderOperateHistoryService {

    @Override
    public QueryWrapper<OmsOrderOperateHistoryEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<OmsOrderOperateHistoryEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}