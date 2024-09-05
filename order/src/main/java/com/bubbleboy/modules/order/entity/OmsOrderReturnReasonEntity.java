package com.bubbleboy.modules.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.util.Date;

/**
 * 退货原因
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@TableName("oms_order_return_reason")
public class OmsOrderReturnReasonEntity {

    /**
     * id
     */
	private Long id;
    /**
     * 退货原因名
     */
	private String name;
    /**
     * 排序
     */
	private Integer sort;
    /**
     * 启用状态
     */
	private Integer status;
    /**
     * create_time
     */
	private Date createTime;
}