package com.bubbleboy.modules.ware.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
public class WmsPurchaseDetailExcel {
    @ExcelProperty(value = "")
    private Long id;
    @ExcelProperty(value = "采购单id")
    private Long purchaseId;
    @ExcelProperty(value = "采购商品id")
    private Long skuId;
    @ExcelProperty(value = "采购数量")
    private Integer skuNum;
    @ExcelProperty(value = "采购金额")
    private BigDecimal skuPrice;
    @ExcelProperty(value = "仓库id")
    private Long wareId;
    @ExcelProperty(value = "状态[0新建，1已分配，2正在采购，3已完成，4采购失败]")
    private Integer status;

}