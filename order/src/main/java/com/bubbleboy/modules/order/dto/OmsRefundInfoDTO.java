package com.bubbleboy.modules.order.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 退款信息
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@Schema(name = "退款信息")
public class OmsRefundInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	private Long id;

	@SchemaProperty(name = "退款的订单")
	private Long orderReturnId;

	@SchemaProperty(name = "退款金额")
	private BigDecimal refund;

	@SchemaProperty(name = "退款交易流水号")
	private String refundSn;

	@SchemaProperty(name = "退款状态")
	private Integer refundStatus;

	@SchemaProperty(name = "退款渠道[1-支付宝，2-微信，3-银联，4-汇款]")
	private Integer refundChannel;

	@SchemaProperty(name = "")
	private String refundContent;


}
