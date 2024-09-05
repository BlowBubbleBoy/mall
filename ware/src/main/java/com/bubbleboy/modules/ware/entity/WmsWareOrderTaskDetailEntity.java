package com.bubbleboy.modules.ware.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.util.Date;

/**
 * 库存工作单
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@TableName("wms_ware_order_task_detail")
public class WmsWareOrderTaskDetailEntity {

    /**
     * id
     */
	private Long id;
    /**
     * sku_id
     */
	private Long skuId;
    /**
     * sku_name
     */
	private String skuName;
    /**
     * 购买个数
     */
	private Integer skuNum;
    /**
     * 工作单id
     */
	private Long taskId;
    /**
     * 仓库id
     */
	private Long wareId;
    /**
     * 1-已锁定  2-已解锁  3-扣减
     */
	private Integer lockStatus;
}