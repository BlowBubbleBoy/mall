package com.bubbleboy.modules.member.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.util.Date;

/**
 * 会员登录记录
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
public class UmsMemberLoginLogExcel {
    @ExcelProperty(value = "id")
    private Long id;
    @ExcelProperty(value = "member_id")
    private Long memberId;
    @ExcelProperty(value = "创建时间")
    private Date createTime;
    @ExcelProperty(value = "ip")
    private String ip;
    @ExcelProperty(value = "city")
    private String city;
    @ExcelProperty(value = "登录类型[1-web，2-app]")
    private Integer loginType;

}