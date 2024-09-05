package com.bubbleboy.modules.coupon.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品spu积分设置
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
public class SmsSpuBoundsExcel {
    @ExcelProperty(value = "id")
    private Long id;
    @ExcelProperty(value = "")
    private Long spuId;
    @ExcelProperty(value = "成长积分")
    private BigDecimal growBounds;
    @ExcelProperty(value = "购物积分")
    private BigDecimal buyBounds;
    @ExcelProperty(value = "优惠生效情况[1111（四个状态位，从右到左）;0 - 无优惠，成长积分是否赠送;1 - 无优惠，购物积分是否赠送;2 - 有优惠，成长积分是否赠送;3 - 有优惠，购物积分是否赠送【状态位0：不赠送，1：赠送】]")
    private Integer work;

}