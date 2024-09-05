package com.bubbleboy.modules.ware.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 采购信息
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@TableName("wms_purchase")
public class WmsPurchaseEntity {

    /**
     * 
     */
	private Long id;
    /**
     * 
     */
	private Long assigneeId;
    /**
     * 
     */
	private String assigneeName;
    /**
     * 
     */
	private String phone;
    /**
     * 
     */
	private Integer priority;
    /**
     * 
     */
	private Integer status;
    /**
     * 
     */
	private Long wareId;
    /**
     * 
     */
	private BigDecimal amount;
    /**
     * 
     */
	private Date createTime;
    /**
     * 
     */
	private Date updateTime;
}