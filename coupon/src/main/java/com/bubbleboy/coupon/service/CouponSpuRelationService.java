package com.bubbleboy.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bubbleboy.common.utils.PageUtils;
import com.bubbleboy.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author bubbleboy
 * @email lsc11400@163.com
 * @date 2024-08-26 22:58:49
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

