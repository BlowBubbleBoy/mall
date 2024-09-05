package com.bubbleboy.modules.member.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 会员统计信息
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Data
@Schema(name = "会员统计信息")
public class UmsMemberStatisticsInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	private Long id;

	@SchemaProperty(name = "会员id")
	private Long memberId;

	@SchemaProperty(name = "累计消费金额")
	private BigDecimal consumeAmount;

	@SchemaProperty(name = "累计优惠金额")
	private BigDecimal couponAmount;

	@SchemaProperty(name = "订单数量")
	private Integer orderCount;

	@SchemaProperty(name = "优惠券数量")
	private Integer couponCount;

	@SchemaProperty(name = "评价数")
	private Integer commentCount;

	@SchemaProperty(name = "退货数量")
	private Integer returnOrderCount;

	@SchemaProperty(name = "登录次数")
	private Integer loginCount;

	@SchemaProperty(name = "关注数量")
	private Integer attendCount;

	@SchemaProperty(name = "粉丝数量")
	private Integer fansCount;

	@SchemaProperty(name = "收藏的商品数量")
	private Integer collectProductCount;

	@SchemaProperty(name = "收藏的专题活动数量")
	private Integer collectSubjectCount;

	@SchemaProperty(name = "收藏的评论数量")
	private Integer collectCommentCount;

	@SchemaProperty(name = "邀请的朋友数量")
	private Integer inviteFriendCount;


}
