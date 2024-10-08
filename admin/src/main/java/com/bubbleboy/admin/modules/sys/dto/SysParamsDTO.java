
package com.bubbleboy.admin.modules.sys.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.bubbleboy.common.validator.group.AddGroup;
import com.bubbleboy.common.validator.group.DefaultGroup;
import com.bubbleboy.common.validator.group.UpdateGroup;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 参数管理
 */
@Data
@Schema(title = "参数管理")
public class SysParamsDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Schema(title = "id")
    @Null(message="{id.null}", groups = AddGroup.class)
    @NotNull(message="{id.require}", groups = UpdateGroup.class)
    private Long id;

    @Schema(title = "参数编码")
    @NotBlank(message="{sysparams.paramcode.require}", groups = DefaultGroup.class)
    private String paramCode;

    @Schema(title = "参数值")
    @NotBlank(message="{sysparams.paramvalue.require}", groups = DefaultGroup.class)
    private String paramValue;

    @Schema(title = "备注")
    private String remark;

    @Schema(title = "创建时间")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Date createDate;

    @Schema(title = "更新时间")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Date updateDate;

}
