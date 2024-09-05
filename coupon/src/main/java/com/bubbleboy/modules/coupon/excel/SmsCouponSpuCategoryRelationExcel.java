package com.bubbleboy.modules.coupon.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.util.Date;

/**
 * 优惠券分类关联
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
public class SmsCouponSpuCategoryRelationExcel {
    @ExcelProperty(value = "id")
    private Long id;
    @ExcelProperty(value = "优惠券id")
    private Long couponId;
    @ExcelProperty(value = "产品分类id")
    private Long categoryId;
    @ExcelProperty(value = "产品分类名称")
    private String categoryName;

}