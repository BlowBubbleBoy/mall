
package com.bubbleboy.admin.modules.security.user;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 登录用户信息
 */
@Data
public class UserDetail implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String username;
    private String realName;
    private String headUrl;
    private Integer gender;
    private String email;
    private String mobile;
    private Long deptId;
    private String password;
    private Integer status;
    private Integer superAdmin;
    /**
     * 部门数据权限
     */
    private List<Long> deptIdList;

}