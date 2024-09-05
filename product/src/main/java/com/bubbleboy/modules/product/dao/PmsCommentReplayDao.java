package com.bubbleboy.modules.product.dao;

import com.bubbleboy.common.dao.BaseDao;
import com.bubbleboy.modules.product.entity.PmsCommentReplayEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Mapper
public interface PmsCommentReplayDao extends BaseDao<PmsCommentReplayEntity> {
	
}