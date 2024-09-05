package com.bubbleboy.modules.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.order.dao.OmsOrderDao;
import com.bubbleboy.modules.order.dto.OmsOrderDTO;
import com.bubbleboy.modules.order.entity.OmsOrderEntity;
import com.bubbleboy.modules.order.service.OmsOrderService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 订单
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class OmsOrderServiceImpl extends CrudServiceImpl<OmsOrderDao, OmsOrderEntity, OmsOrderDTO> implements OmsOrderService {

    @Override
    public QueryWrapper<OmsOrderEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<OmsOrderEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}