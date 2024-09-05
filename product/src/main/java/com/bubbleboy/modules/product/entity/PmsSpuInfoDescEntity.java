package com.bubbleboy.modules.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.util.Date;

/**
 * spu信息介绍
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@TableName("pms_spu_info_desc")
public class PmsSpuInfoDescEntity {

    /**
     * 商品id
     */
	private Long spuId;
    /**
     * 商品介绍
     */
	private String decript;
}