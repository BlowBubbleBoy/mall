package com.bubbleboy.modules.ware.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.util.Date;

/**
 * 
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
public class UndoLogExcel {
    @ExcelProperty(value = "")
    private Long id;
    @ExcelProperty(value = "")
    private Long branchId;
    @ExcelProperty(value = "")
    private String xid;
    @ExcelProperty(value = "")
    private String context;
    @ExcelProperty(value = "")
    private byte[] rollbackInfo;
    @ExcelProperty(value = "")
    private Integer logStatus;
    @ExcelProperty(value = "")
    private Date logCreated;
    @ExcelProperty(value = "")
    private Date logModified;
    @ExcelProperty(value = "")
    private String ext;

}