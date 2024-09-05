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
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
public class SmsHomeSubjectExcel {
    @ExcelProperty(value = "id")
    private Long id;
    @ExcelProperty(value = "专题名字")
    private String name;
    @ExcelProperty(value = "专题标题")
    private String title;
    @ExcelProperty(value = "专题副标题")
    private String subTitle;
    @ExcelProperty(value = "显示状态")
    private Integer status;
    @ExcelProperty(value = "详情连接")
    private String url;
    @ExcelProperty(value = "排序")
    private Integer sort;
    @ExcelProperty(value = "专题图片地址")
    private String img;

}