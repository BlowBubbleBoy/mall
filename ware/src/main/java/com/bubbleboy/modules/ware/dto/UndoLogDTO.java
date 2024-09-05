package com.bubbleboy.modules.ware.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@Schema(name = "")
public class UndoLogDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "")
	private Long id;

	@SchemaProperty(name = "")
	private Long branchId;

	@SchemaProperty(name = "")
	private String xid;

	@SchemaProperty(name = "")
	private String context;

	@SchemaProperty(name = "")
	private byte[] rollbackInfo;

	@SchemaProperty(name = "")
	private Integer logStatus;

	@SchemaProperty(name = "")
	private Date logCreated;

	@SchemaProperty(name = "")
	private Date logModified;

	@SchemaProperty(name = "")
	private String ext;


}
