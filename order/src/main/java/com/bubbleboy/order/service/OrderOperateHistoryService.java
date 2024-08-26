package com.bubbleboy.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bubbleboy.common.utils.PageUtils;
import com.bubbleboy.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author bubbleboy
 * @email lsc11400@163.com
 * @date 2024-08-26 23:07:32
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

