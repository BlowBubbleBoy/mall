package com.bubbleboy.modules.coupon.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * 商品满减信息
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@Schema(name = "商品满减信息")
public class SmsSkuFullReductionDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	private Long id;

	@SchemaProperty(name = "spu_id")
	private Long skuId;

	@SchemaProperty(name = "满多少")
	private BigDecimal fullPrice;

	@SchemaProperty(name = "减多少")
	private BigDecimal reducePrice;

	@SchemaProperty(name = "是否参与其他优惠")
	private Integer addOther;


}
