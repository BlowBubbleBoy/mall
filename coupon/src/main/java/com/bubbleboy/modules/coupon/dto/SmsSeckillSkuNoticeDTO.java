package com.bubbleboy.modules.coupon.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 秒杀商品通知订阅
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@Schema(name = "秒杀商品通知订阅")
public class SmsSeckillSkuNoticeDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	private Long id;

	@SchemaProperty(name = "member_id")
	private Long memberId;

	@SchemaProperty(name = "sku_id")
	private Long skuId;

	@SchemaProperty(name = "活动场次id")
	private Long sessionId;

	@SchemaProperty(name = "订阅时间")
	private Date subcribeTime;

	@SchemaProperty(name = "发送时间")
	private Date sendTime;

	@SchemaProperty(name = "通知方式[0-短信，1-邮件]")
	private Integer noticeType;


}
