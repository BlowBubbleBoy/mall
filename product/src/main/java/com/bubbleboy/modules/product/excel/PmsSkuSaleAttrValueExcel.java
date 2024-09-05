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
 * sku销售属性&值
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
public class PmsSkuSaleAttrValueExcel {
    @ExcelProperty(value = "id")
    private Long id;
    @ExcelProperty(value = "sku_id")
    private Long skuId;
    @ExcelProperty(value = "attr_id")
    private Long attrId;
    @ExcelProperty(value = "销售属性名")
    private String attrName;
    @ExcelProperty(value = "销售属性值")
    private String attrValue;
    @ExcelProperty(value = "顺序")
    private Integer attrSort;

}