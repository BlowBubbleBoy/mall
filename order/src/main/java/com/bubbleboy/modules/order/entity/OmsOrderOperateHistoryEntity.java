package com.bubbleboy.modules.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.util.Date;

/**
 * 订单操作历史记录
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@TableName("oms_order_operate_history")
public class OmsOrderOperateHistoryEntity {

    /**
     * id
     */
	private Long id;
    /**
     * 订单id
     */
	private Long orderId;
    /**
     * 操作人[用户；系统；后台管理员]
     */
	private String operateMan;
    /**
     * 操作时间
     */
	private Date createTime;
    /**
     * 订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
     */
	private Integer orderStatus;
    /**
     * 备注
     */
	private String note;
}