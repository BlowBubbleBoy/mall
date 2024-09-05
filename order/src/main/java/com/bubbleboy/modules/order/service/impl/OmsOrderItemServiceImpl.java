package com.bubbleboy.modules.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.order.dao.OmsOrderItemDao;
import com.bubbleboy.modules.order.dto.OmsOrderItemDTO;
import com.bubbleboy.modules.order.entity.OmsOrderItemEntity;
import com.bubbleboy.modules.order.service.OmsOrderItemService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class OmsOrderItemServiceImpl extends CrudServiceImpl<OmsOrderItemDao, OmsOrderItemEntity, OmsOrderItemDTO> implements OmsOrderItemService {

    @Override
    public QueryWrapper<OmsOrderItemEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<OmsOrderItemEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}