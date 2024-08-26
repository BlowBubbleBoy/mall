package com.bubbleboy.product.dao;

import com.bubbleboy.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author bubbleboy
 * @email lsc11400@163.com
 * @date 2024-08-26 19:56:41
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
