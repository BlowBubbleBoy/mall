package com.bubbleboy.modules.coupon.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * 专题商品
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@Schema(name = "专题商品")
public class SmsHomeSubjectSpuDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	private Long id;

	@SchemaProperty(name = "专题名字")
	private String name;

	@SchemaProperty(name = "专题id")
	private Long subjectId;

	@SchemaProperty(name = "spu_id")
	private Long spuId;

	@SchemaProperty(name = "排序")
	private Integer sort;


}
