package com.bubbleboy.modules.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * sku销售属性&值
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@Schema(name = "sku销售属性&值")
public class PmsSkuSaleAttrValueDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	private Long id;

	@SchemaProperty(name = "sku_id")
	private Long skuId;

	@SchemaProperty(name = "attr_id")
	private Long attrId;

	@SchemaProperty(name = "销售属性名")
	private String attrName;

	@SchemaProperty(name = "销售属性值")
	private String attrValue;

	@SchemaProperty(name = "顺序")
	private Integer attrSort;


}
