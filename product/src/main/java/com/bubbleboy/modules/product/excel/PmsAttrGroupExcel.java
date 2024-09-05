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
 * 属性分组
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
public class PmsAttrGroupExcel {
    @ExcelProperty(value = "分组id")
    private Long attrGroupId;
    @ExcelProperty(value = "组名")
    private String attrGroupName;
    @ExcelProperty(value = "排序")
    private Integer sort;
    @ExcelProperty(value = "描述")
    private String descript;
    @ExcelProperty(value = "组图标")
    private String icon;
    @ExcelProperty(value = "所属分类id")
    private Long catelogId;

}