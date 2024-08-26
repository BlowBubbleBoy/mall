package com.bubbleboy.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bubbleboy.common.utils.PageUtils;
import com.bubbleboy.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author bubbleboy
 * @email lsc11400@163.com
 * @date 2024-08-26 22:58:49
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

