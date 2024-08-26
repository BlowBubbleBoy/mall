package com.bubbleboy.order.dao;

import com.bubbleboy.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author bubbleboy
 * @email lsc11400@163.com
 * @date 2024-08-26 23:07:31
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
