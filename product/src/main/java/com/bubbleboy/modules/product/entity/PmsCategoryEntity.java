package com.bubbleboy.modules.product.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

/**
 * 商品三级分类
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@TableName("pms_category")
public class PmsCategoryEntity {

    /**
     * 分类id
     */
	private Long catId;
    /**
     * 分类名称
     */
	private String name;
    /**
     * 父分类id
     */
	private Long parentCid;
    /**
     * 层级
     */
	private Integer catLevel;
    /**
     * 是否显示[0-不显示，1显示]
     */
	private Integer showStatus;
    /**
     * 排序
     */
	private Integer sort;
    /**
     * 图标地址
     */
	private String icon;
    /**
     * 计量单位
     */
	private String productUnit;
    /**
     * 商品数量
     */
	private Integer productCount;

    @TableField(exist = false)
    private List<PmsCategoryEntity> children;
}