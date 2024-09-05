package com.bubbleboy.modules.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.util.Date;

/**
 * 品牌分类关联
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@TableName("pms_category_brand_relation")
public class PmsCategoryBrandRelationEntity {

    /**
     * 
     */
	private Long id;
    /**
     * 品牌id
     */
	private Long brandId;
    /**
     * 分类id
     */
	private Long catelogId;
    /**
     * 
     */
	private String brandName;
    /**
     * 
     */
	private String catelogName;
}