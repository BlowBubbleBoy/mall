package com.bubbleboy.modules.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品会员价格
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@TableName("sms_member_price")
public class SmsMemberPriceEntity {

    /**
     * id
     */
	private Long id;
    /**
     * sku_id
     */
	private Long skuId;
    /**
     * 会员等级id
     */
	private Long memberLevelId;
    /**
     * 会员等级名
     */
	private String memberLevelName;
    /**
     * 会员对应价格
     */
	private BigDecimal memberPrice;
    /**
     * 可否叠加其他优惠[0-不可叠加优惠，1-可叠加]
     */
	private Integer addOther;
}