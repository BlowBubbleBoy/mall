package com.bubbleboy.modules.member.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 会员等级
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@TableName("ums_member_level")
public class UmsMemberLevelEntity {

    /**
     * id
     */
	private Long id;
    /**
     * 等级名称
     */
	private String name;
    /**
     * 等级需要的成长值
     */
	private Integer growthPoint;
    /**
     * 是否为默认等级[0->不是；1->是]
     */
	private Integer defaultStatus;
    /**
     * 免运费标准
     */
	private BigDecimal freeFreightPoint;
    /**
     * 每次评价获取的成长值
     */
	private Integer commentGrowthPoint;
    /**
     * 是否有免邮特权
     */
	private Integer priviledgeFreeFreight;
    /**
     * 是否有会员价格特权
     */
	private Integer priviledgeMemberPrice;
    /**
     * 是否有生日特权
     */
	private Integer priviledgeBirthday;
    /**
     * 备注
     */
	private String note;
}