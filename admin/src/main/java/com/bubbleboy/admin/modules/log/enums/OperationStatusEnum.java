
package com.bubbleboy.admin.modules.log.enums;

/**
 * 操作状态枚举
 */
public enum OperationStatusEnum {
    /**
     * 失败
     */
    FAIL(0),
    /**
     * 成功
     */
    SUCCESS(1);

    private final int value;

    OperationStatusEnum(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }
}