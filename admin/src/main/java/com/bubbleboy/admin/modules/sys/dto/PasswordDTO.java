
package com.bubbleboy.admin.modules.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 修改密码
 */
@Data
@Schema(title = "修改密码")
public class PasswordDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Schema(title = "原密码")
    @NotBlank(message="{sysuser.password.require}")
    private String password;

    @Schema(title = "新密码")
    @NotBlank(message="{sysuser.password.require}")
    private String newPassword;

}
