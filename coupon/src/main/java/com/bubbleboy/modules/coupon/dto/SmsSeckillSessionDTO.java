package com.bubbleboy.modules.coupon.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 秒杀活动场次
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@Schema(name = "秒杀活动场次")
public class SmsSeckillSessionDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	private Long id;

	@SchemaProperty(name = "场次名称")
	private String name;

	@SchemaProperty(name = "每日开始时间")
	private Date startTime;

	@SchemaProperty(name = "每日结束时间")
	private Date endTime;

	@SchemaProperty(name = "启用状态")
	private Integer status;

	@SchemaProperty(name = "创建时间")
	private Date createTime;


}
