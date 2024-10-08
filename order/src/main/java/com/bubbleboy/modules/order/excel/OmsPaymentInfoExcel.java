package com.bubbleboy.modules.order.excel;

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
 * 支付信息表
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
public class OmsPaymentInfoExcel {
    @ExcelProperty(value = "id")
    private Long id;
    @ExcelProperty(value = "订单号（对外业务号）")
    private String orderSn;
    @ExcelProperty(value = "订单id")
    private Long orderId;
    @ExcelProperty(value = "支付宝交易流水号")
    private String alipayTradeNo;
    @ExcelProperty(value = "支付总金额")
    private BigDecimal totalAmount;
    @ExcelProperty(value = "交易内容")
    private String subject;
    @ExcelProperty(value = "支付状态")
    private String paymentStatus;
    @ExcelProperty(value = "创建时间")
    private Date createTime;
    @ExcelProperty(value = "确认时间")
    private Date confirmTime;
    @ExcelProperty(value = "回调内容")
    private String callbackContent;
    @ExcelProperty(value = "回调时间")
    private Date callbackTime;

}