package com.bubbleboy.ware.dao;

import com.bubbleboy.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author bubbleboy
 * @email lsc11400@163.com
 * @date 2024-08-26 23:02:07
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
