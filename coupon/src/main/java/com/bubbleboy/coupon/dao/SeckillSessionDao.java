package com.bubbleboy.coupon.dao;

import com.bubbleboy.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author bubbleboy
 * @email lsc11400@163.com
 * @date 2024-08-26 22:58:47
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
