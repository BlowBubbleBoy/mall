package com.bubbleboy.modules.coupon.dao;

import com.bubbleboy.common.dao.BaseDao;
import com.bubbleboy.modules.coupon.entity.SmsCouponSpuCategoryRelationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券分类关联
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Mapper
public interface SmsCouponSpuCategoryRelationDao extends BaseDao<SmsCouponSpuCategoryRelationEntity> {
	
}