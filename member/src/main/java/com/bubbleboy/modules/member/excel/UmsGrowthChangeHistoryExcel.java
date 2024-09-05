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
 * 成长值变化历史记录
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
public class UmsGrowthChangeHistoryExcel {
    @ExcelProperty(value = "id")
    private Long id;
    @ExcelProperty(value = "member_id")
    private Long memberId;
    @ExcelProperty(value = "create_time")
    private Date createTime;
    @ExcelProperty(value = "改变的值（正负计数）")
    private Integer changeCount;
    @ExcelProperty(value = "备注")
    private String note;
    @ExcelProperty(value = "积分来源[0-购物，1-管理员修改]")
    private Integer sourceType;

}