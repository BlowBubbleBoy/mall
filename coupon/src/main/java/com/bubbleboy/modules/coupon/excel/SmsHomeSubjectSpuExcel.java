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
 * 专题商品
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
public class SmsHomeSubjectSpuExcel {
    @ExcelProperty(value = "id")
    private Long id;
    @ExcelProperty(value = "专题名字")
    private String name;
    @ExcelProperty(value = "专题id")
    private Long subjectId;
    @ExcelProperty(value = "spu_id")
    private Long spuId;
    @ExcelProperty(value = "排序")
    private Integer sort;

}