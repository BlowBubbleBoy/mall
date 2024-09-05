package com.bubbleboy.modules.coupon.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 商品会员价格
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@Schema(name = "商品会员价格")
public class SmsMemberPriceDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	private Long id;

	@SchemaProperty(name = "sku_id")
	private Long skuId;

	@SchemaProperty(name = "会员等级id")
	private Long memberLevelId;

	@SchemaProperty(name = "会员等级名")
	private String memberLevelName;

	@SchemaProperty(name = "会员对应价格")
	private BigDecimal memberPrice;

	@SchemaProperty(name = "可否叠加其他优惠[0-不可叠加优惠，1-可叠加]")
	private Integer addOther;


}
