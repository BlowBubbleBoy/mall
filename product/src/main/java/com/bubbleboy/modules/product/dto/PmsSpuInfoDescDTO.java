package com.bubbleboy.modules.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * spu信息介绍
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@Schema(name = "spu信息介绍")
public class PmsSpuInfoDescDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "商品id")
	private Long spuId;

	@SchemaProperty(name = "商品介绍")
	private String decript;


}
