
package com.bubbleboy.admin.modules.oss.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.bubbleboy.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 文件上传
 * 
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("sys_oss")
public class SysOssEntity extends BaseEntity {
	private static final long serialVersionUID = 1L;

	/**
	 * URL地址
	 */
	private String url;

}