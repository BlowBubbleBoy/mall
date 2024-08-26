package com.bubbleboy.coupon.dao;

import com.bubbleboy.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author bubbleboy
 * @email lsc11400@163.com
 * @date 2024-08-26 22:58:49
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
