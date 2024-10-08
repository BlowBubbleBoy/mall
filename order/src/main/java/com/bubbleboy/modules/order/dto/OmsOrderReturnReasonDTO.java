package com.bubbleboy.modules.order.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 退货原因
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@Schema(name = "退货原因")
public class OmsOrderReturnReasonDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	private Long id;

	@SchemaProperty(name = "退货原因名")
	private String name;

	@SchemaProperty(name = "排序")
	private Integer sort;

	@SchemaProperty(name = "启用状态")
	private Integer status;

	@SchemaProperty(name = "create_time")
	private Date createTime;


}
