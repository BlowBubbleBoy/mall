package com.bubbleboy.modules.member.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 会员收藏的商品
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@Schema(name = "会员收藏的商品")
public class UmsMemberCollectSpuDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	private Long id;

	@SchemaProperty(name = "会员id")
	private Long memberId;

	@SchemaProperty(name = "spu_id")
	private Long spuId;

	@SchemaProperty(name = "spu_name")
	private String spuName;

	@SchemaProperty(name = "spu_img")
	private String spuImg;

	@SchemaProperty(name = "create_time")
	private Date createTime;


}
