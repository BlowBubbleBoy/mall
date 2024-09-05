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
 * 属性&属性分组关联
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
public class PmsAttrAttrgroupRelationExcel {
    @ExcelProperty(value = "id")
    private Long id;
    @ExcelProperty(value = "属性id")
    private Long attrId;
    @ExcelProperty(value = "属性分组id")
    private Long attrGroupId;
    @ExcelProperty(value = "属性组内排序")
    private Integer attrSort;

}