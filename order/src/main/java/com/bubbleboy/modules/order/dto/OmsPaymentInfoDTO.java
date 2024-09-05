package com.bubbleboy.modules.order.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * 支付信息表
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@Schema(name = "支付信息表")
public class OmsPaymentInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	private Long id;

	@SchemaProperty(name = "订单号（对外业务号）")
	private String orderSn;

	@SchemaProperty(name = "订单id")
	private Long orderId;

	@SchemaProperty(name = "支付宝交易流水号")
	private String alipayTradeNo;

	@SchemaProperty(name = "支付总金额")
	private BigDecimal totalAmount;

	@SchemaProperty(name = "交易内容")
	private String subject;

	@SchemaProperty(name = "支付状态")
	private String paymentStatus;

	@SchemaProperty(name = "创建时间")
	private Date createTime;

	@SchemaProperty(name = "确认时间")
	private Date confirmTime;

	@SchemaProperty(name = "回调内容")
	private String callbackContent;

	@SchemaProperty(name = "回调时间")
	private Date callbackTime;


}
