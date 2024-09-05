package com.bubbleboy.modules.coupon.dao;

import com.bubbleboy.common.dao.BaseDao;
import com.bubbleboy.modules.coupon.entity.SmsCouponEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Mapper
public interface SmsCouponDao extends BaseDao<SmsCouponEntity> {
	
}