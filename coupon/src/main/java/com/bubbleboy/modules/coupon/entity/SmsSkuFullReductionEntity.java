package com.bubbleboy.modules.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品满减信息
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@TableName("sms_sku_full_reduction")
public class SmsSkuFullReductionEntity {

    /**
     * id
     */
	private Long id;
    /**
     * spu_id
     */
	private Long skuId;
    /**
     * 满多少
     */
	private BigDecimal fullPrice;
    /**
     * 减多少
     */
	private BigDecimal reducePrice;
    /**
     * 是否参与其他优惠
     */
	private Integer addOther;
}