package com.bubbleboy.modules.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 退款信息
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@TableName("oms_refund_info")
public class OmsRefundInfoEntity {

    /**
     * id
     */
	private Long id;
    /**
     * 退款的订单
     */
	private Long orderReturnId;
    /**
     * 退款金额
     */
	private BigDecimal refund;
    /**
     * 退款交易流水号
     */
	private String refundSn;
    /**
     * 退款状态
     */
	private Integer refundStatus;
    /**
     * 退款渠道[1-支付宝，2-微信，3-银联，4-汇款]
     */
	private Integer refundChannel;
    /**
     * 
     */
	private String refundContent;
}