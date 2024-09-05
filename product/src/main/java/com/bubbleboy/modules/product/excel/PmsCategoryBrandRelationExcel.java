package com.bubbleboy.modules.product.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
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
public class PmsCategoryBrandRelationExcel {
    @ExcelProperty(value = "")
    private Long id;
    @ExcelProperty(value = "品牌id")
    private Long brandId;
    @ExcelProperty(value = "分类id")
    private Long catelogId;
    @ExcelProperty(value = "")
    private String brandName;
    @ExcelProperty(value = "")
    private String catelogName;

}