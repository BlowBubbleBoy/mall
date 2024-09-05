package com.bubbleboy.modules.order.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.util.Date;

/**
 * 退货原因
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
public class OmsOrderReturnReasonExcel {
    @ExcelProperty(value = "id")
    private Long id;
    @ExcelProperty(value = "退货原因名")
    private String name;
    @ExcelProperty(value = "排序")
    private Integer sort;
    @ExcelProperty(value = "启用状态")
    private Integer status;
    @ExcelProperty(value = "create_time")
    private Date createTime;

}