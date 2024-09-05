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
 * 品牌
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
public class PmsBrandExcel {
    @ExcelProperty(value = "品牌id")
    private Long brandId;
    @ExcelProperty(value = "品牌名")
    private String name;
    @ExcelProperty(value = "品牌logo地址")
    private String logo;
    @ExcelProperty(value = "介绍")
    private String descript;
    @ExcelProperty(value = "显示状态[0-不显示；1-显示]")
    private Integer showStatus;
    @ExcelProperty(value = "检索首字母")
    private String firstLetter;
    @ExcelProperty(value = "排序")
    private Integer sort;

}