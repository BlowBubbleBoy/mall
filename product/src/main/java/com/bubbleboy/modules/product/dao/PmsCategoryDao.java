package com.bubbleboy.modules.product.dao;

import com.bubbleboy.common.dao.BaseDao;
import com.bubbleboy.modules.product.entity.PmsCategoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Mapper
public interface PmsCategoryDao extends BaseDao<PmsCategoryEntity> {
	
}