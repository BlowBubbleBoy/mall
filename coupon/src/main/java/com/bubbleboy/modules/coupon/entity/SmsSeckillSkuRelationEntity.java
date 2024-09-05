package com.bubbleboy.modules.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 秒杀活动商品关联
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@TableName("sms_seckill_sku_relation")
public class SmsSeckillSkuRelationEntity {

    /**
     * id
     */
	private Long id;
    /**
     * 活动id
     */
	private Long promotionId;
    /**
     * 活动场次id
     */
	private Long promotionSessionId;
    /**
     * 商品id
     */
	private Long skuId;
    /**
     * 秒杀价格
     */
	private BigDecimal seckillPrice;
    /**
     * 秒杀总量
     */
	private BigDecimal seckillCount;
    /**
     * 每人限购数量
     */
	private BigDecimal seckillLimit;
    /**
     * 排序
     */
	private Integer seckillSort;
}