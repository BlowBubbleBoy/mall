package com.bubbleboy.order.dao;

import com.bubbleboy.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author bubbleboy
 * @email lsc11400@163.com
 * @date 2024-08-26 23:07:32
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
