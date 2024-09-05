package com.bubbleboy.modules.member.dao;

import com.bubbleboy.common.dao.BaseDao;
import com.bubbleboy.modules.member.entity.UmsGrowthChangeHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Mapper
public interface UmsGrowthChangeHistoryDao extends BaseDao<UmsGrowthChangeHistoryEntity> {
	
}