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
 * sku图片
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
public class PmsSkuImagesExcel {
    @ExcelProperty(value = "id")
    private Long id;
    @ExcelProperty(value = "sku_id")
    private Long skuId;
    @ExcelProperty(value = "图片地址")
    private String imgUrl;
    @ExcelProperty(value = "排序")
    private Integer imgSort;
    @ExcelProperty(value = "默认图[0 - 不是默认图，1 - 是默认图]")
    private Integer defaultImg;

}