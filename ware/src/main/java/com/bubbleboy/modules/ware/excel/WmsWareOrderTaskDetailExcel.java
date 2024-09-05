package com.bubbleboy.modules.ware.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.util.Date;

/**
 * 库存工作单
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
public class WmsWareOrderTaskDetailExcel {
    @ExcelProperty(value = "id")
    private Long id;
    @ExcelProperty(value = "sku_id")
    private Long skuId;
    @ExcelProperty(value = "sku_name")
    private String skuName;
    @ExcelProperty(value = "购买个数")
    private Integer skuNum;
    @ExcelProperty(value = "工作单id")
    private Long taskId;
    @ExcelProperty(value = "仓库id")
    private Long wareId;
    @ExcelProperty(value = "1-已锁定  2-已解锁  3-扣减")
    private Integer lockStatus;

}