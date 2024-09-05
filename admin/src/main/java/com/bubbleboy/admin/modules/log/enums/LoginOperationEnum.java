
package com.bubbleboy.admin.modules.log.enums;

/**
 * 登录操作枚举
 */
public enum LoginOperationEnum {
    /**
     * 用户登录
     */
    LOGIN(0),
    /**
     * 用户退出
     */
    LOGOUT(1);

    private final int value;

    LoginOperationEnum(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }
}