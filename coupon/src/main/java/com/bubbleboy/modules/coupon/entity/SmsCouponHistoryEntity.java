package com.bubbleboy.modules.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.util.Date;

/**
 * 优惠券领取历史记录
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@TableName("sms_coupon_history")
public class SmsCouponHistoryEntity {

    /**
     * id
     */
	private Long id;
    /**
     * 优惠券id
     */
	private Long couponId;
    /**
     * 会员id
     */
	private Long memberId;
    /**
     * 会员名字
     */
	private String memberNickName;
    /**
     * 获取方式[0->后台赠送；1->主动领取]
     */
	private Integer getType;
    /**
     * 创建时间
     */
	private Date createTime;
    /**
     * 使用状态[0->未使用；1->已使用；2->已过期]
     */
	private Integer useType;
    /**
     * 使用时间
     */
	private Date useTime;
    /**
     * 订单id
     */
	private Long orderId;
    /**
     * 订单号
     */
	private Long orderSn;
}