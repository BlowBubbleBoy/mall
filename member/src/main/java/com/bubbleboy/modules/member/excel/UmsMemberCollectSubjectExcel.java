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
 * 会员收藏的专题活动
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
public class UmsMemberCollectSubjectExcel {
    @ExcelProperty(value = "id")
    private Long id;
    @ExcelProperty(value = "subject_id")
    private Long subjectId;
    @ExcelProperty(value = "subject_name")
    private String subjectName;
    @ExcelProperty(value = "subject_img")
    private String subjectImg;
    @ExcelProperty(value = "活动url")
    private String subjectUrll;

}