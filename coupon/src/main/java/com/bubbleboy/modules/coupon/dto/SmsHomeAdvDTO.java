package com.bubbleboy.modules.coupon.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 首页轮播广告
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@Schema(name = "首页轮播广告")
public class SmsHomeAdvDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	private Long id;

	@SchemaProperty(name = "名字")
	private String name;

	@SchemaProperty(name = "图片地址")
	private String pic;

	@SchemaProperty(name = "开始时间")
	private Date startTime;

	@SchemaProperty(name = "结束时间")
	private Date endTime;

	@SchemaProperty(name = "状态")
	private Integer status;

	@SchemaProperty(name = "点击数")
	private Integer clickCount;

	@SchemaProperty(name = "广告详情连接地址")
	private String url;

	@SchemaProperty(name = "备注")
	private String note;

	@SchemaProperty(name = "排序")
	private Integer sort;

	@SchemaProperty(name = "发布者")
	private Long publisherId;

	@SchemaProperty(name = "审核者")
	private Long authId;


}
