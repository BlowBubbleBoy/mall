package com.bubbleboy.modules.order.dao;

import com.bubbleboy.common.dao.BaseDao;
import com.bubbleboy.modules.order.entity.OmsOrderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Mapper
public interface OmsOrderDao extends BaseDao<OmsOrderEntity> {
	
}