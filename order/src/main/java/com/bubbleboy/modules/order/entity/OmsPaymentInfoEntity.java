package com.bubbleboy.modules.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 支付信息表
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@TableName("oms_payment_info")
public class OmsPaymentInfoEntity {

    /**
     * id
     */
	private Long id;
    /**
     * 订单号（对外业务号）
     */
	private String orderSn;
    /**
     * 订单id
     */
	private Long orderId;
    /**
     * 支付宝交易流水号
     */
	private String alipayTradeNo;
    /**
     * 支付总金额
     */
	private BigDecimal totalAmount;
    /**
     * 交易内容
     */
	private String subject;
    /**
     * 支付状态
     */
	private String paymentStatus;
    /**
     * 创建时间
     */
	private Date createTime;
    /**
     * 确认时间
     */
	private Date confirmTime;
    /**
     * 回调内容
     */
	private String callbackContent;
    /**
     * 回调时间
     */
	private Date callbackTime;
}