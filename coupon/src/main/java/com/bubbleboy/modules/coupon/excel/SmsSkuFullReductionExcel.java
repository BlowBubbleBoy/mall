package com.bubbleboy.modules.coupon.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品满减信息
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
public class SmsSkuFullReductionExcel {
    @ExcelProperty(value = "id")
    private Long id;
    @ExcelProperty(value = "spu_id")
    private Long skuId;
    @ExcelProperty(value = "满多少")
    private BigDecimal fullPrice;
    @ExcelProperty(value = "减多少")
    private BigDecimal reducePrice;
    @ExcelProperty(value = "是否参与其他优惠")
    private Integer addOther;

}