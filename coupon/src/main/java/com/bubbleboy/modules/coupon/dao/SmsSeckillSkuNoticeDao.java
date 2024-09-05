package com.bubbleboy.modules.coupon.dao;

import com.bubbleboy.common.dao.BaseDao;
import com.bubbleboy.modules.coupon.entity.SmsSeckillSkuNoticeEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀商品通知订阅
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Mapper
public interface SmsSeckillSkuNoticeDao extends BaseDao<SmsSeckillSkuNoticeEntity> {
	
}