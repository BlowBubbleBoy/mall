package com.bubbleboy.modules.ware.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 仓库信息
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@Schema(name = "仓库信息")
public class WmsWareInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	private Long id;

	@SchemaProperty(name = "仓库名")
	private String name;

	@SchemaProperty(name = "仓库地址")
	private String address;

	@SchemaProperty(name = "区域编码")
	private String areacode;


}
