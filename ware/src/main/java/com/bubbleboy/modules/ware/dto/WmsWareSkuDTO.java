package com.bubbleboy.modules.ware.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * 商品库存
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@Schema(name = "商品库存")
public class WmsWareSkuDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	private Long id;

	@SchemaProperty(name = "sku_id")
	private Long skuId;

	@SchemaProperty(name = "仓库id")
	private Long wareId;

	@SchemaProperty(name = "库存数")
	private Integer stock;

	@SchemaProperty(name = "sku_name")
	private String skuName;

	@SchemaProperty(name = "锁定库存")
	private Integer stockLocked;


}
