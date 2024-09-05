package com.bubbleboy.modules.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.util.Date;

/**
 * 秒杀商品通知订阅
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@TableName("sms_seckill_sku_notice")
public class SmsSeckillSkuNoticeEntity {

    /**
     * id
     */
	private Long id;
    /**
     * member_id
     */
	private Long memberId;
    /**
     * sku_id
     */
	private Long skuId;
    /**
     * 活动场次id
     */
	private Long sessionId;
    /**
     * 订阅时间
     */
	private Date subcribeTime;
    /**
     * 发送时间
     */
	private Date sendTime;
    /**
     * 通知方式[0-短信，1-邮件]
     */
	private Integer noticeType;
}