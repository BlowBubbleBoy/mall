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
 * 退款信息
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
public class OmsRefundInfoExcel {
    @ExcelProperty(value = "id")
    private Long id;
    @ExcelProperty(value = "退款的订单")
    private Long orderReturnId;
    @ExcelProperty(value = "退款金额")
    private BigDecimal refund;
    @ExcelProperty(value = "退款交易流水号")
    private String refundSn;
    @ExcelProperty(value = "退款状态")
    private Integer refundStatus;
    @ExcelProperty(value = "退款渠道[1-支付宝，2-微信，3-银联，4-汇款]")
    private Integer refundChannel;
    @ExcelProperty(value = "")
    private String refundContent;

}