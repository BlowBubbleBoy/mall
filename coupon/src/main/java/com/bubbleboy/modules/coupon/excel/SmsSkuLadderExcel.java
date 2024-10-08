package com.bubbleboy.modules.coupon.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品阶梯价格
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
public class SmsSkuLadderExcel {
    @ExcelProperty(value = "id")
    private Long id;
    @ExcelProperty(value = "spu_id")
    private Long skuId;
    @ExcelProperty(value = "满几件")
    private Integer fullCount;
    @ExcelProperty(value = "打几折")
    private BigDecimal discount;
    @ExcelProperty(value = "折后价")
    private BigDecimal price;
    @ExcelProperty(value = "是否叠加其他优惠[0-不可叠加，1-可叠加]")
    private Integer addOther;

}