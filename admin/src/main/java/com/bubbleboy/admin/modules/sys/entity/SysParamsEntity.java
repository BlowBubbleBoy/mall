
package com.bubbleboy.admin.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bubbleboy.common.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 参数管理
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("sys_params")
public class SysParamsEntity extends BaseEntity {
	private static final long serialVersionUID = 1L;

	/**
	 * 参数编码
	 */
	private String paramCode;
	/**
	 * 参数值
	 */
	private String paramValue;
	/**
	 * 类型   0：系统参数   1：非系统参数
	 */
	private Integer paramType;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 更新者
	 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Long updater;
	/**
	 * 更新时间
	 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Date updateDate;

}