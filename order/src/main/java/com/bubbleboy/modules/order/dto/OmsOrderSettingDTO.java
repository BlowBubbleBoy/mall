package com.bubbleboy.modules.order.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 订单配置信息
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@Schema(name = "订单配置信息")
public class OmsOrderSettingDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	private Long id;

	@SchemaProperty(name = "秒杀订单超时关闭时间(分)")
	private Integer flashOrderOvertime;

	@SchemaProperty(name = "正常订单超时时间(分)")
	private Integer normalOrderOvertime;

	@SchemaProperty(name = "发货后自动确认收货时间（天）")
	private Integer confirmOvertime;

	@SchemaProperty(name = "自动完成交易时间，不能申请退货（天）")
	private Integer finishOvertime;

	@SchemaProperty(name = "订单完成后自动好评时间（天）")
	private Integer commentOvertime;

	@SchemaProperty(name = "会员等级【0-不限会员等级，全部通用；其他-对应的其他会员等级】")
	private Integer memberLevel;


}
