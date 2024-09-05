package com.bubbleboy.modules.coupon.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 秒杀活动商品关联
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
public class SmsSeckillSkuRelationExcel {
    @ExcelProperty(value = "id")
    private Long id;
    @ExcelProperty(value = "活动id")
    private Long promotionId;
    @ExcelProperty(value = "活动场次id")
    private Long promotionSessionId;
    @ExcelProperty(value = "商品id")
    private Long skuId;
    @ExcelProperty(value = "秒杀价格")
    private BigDecimal seckillPrice;
    @ExcelProperty(value = "秒杀总量")
    private BigDecimal seckillCount;
    @ExcelProperty(value = "每人限购数量")
    private BigDecimal seckillLimit;
    @ExcelProperty(value = "排序")
    private Integer seckillSort;

}