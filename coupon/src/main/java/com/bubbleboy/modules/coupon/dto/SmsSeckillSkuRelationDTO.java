package com.bubbleboy.modules.coupon.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 秒杀活动商品关联
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@Schema(name = "秒杀活动商品关联")
public class SmsSeckillSkuRelationDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	private Long id;

	@SchemaProperty(name = "活动id")
	private Long promotionId;

	@SchemaProperty(name = "活动场次id")
	private Long promotionSessionId;

	@SchemaProperty(name = "商品id")
	private Long skuId;

	@SchemaProperty(name = "秒杀价格")
	private BigDecimal seckillPrice;

	@SchemaProperty(name = "秒杀总量")
	private BigDecimal seckillCount;

	@SchemaProperty(name = "每人限购数量")
	private BigDecimal seckillLimit;

	@SchemaProperty(name = "排序")
	private Integer seckillSort;


}
