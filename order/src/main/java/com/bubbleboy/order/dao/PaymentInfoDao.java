package com.bubbleboy.order.dao;

import com.bubbleboy.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author bubbleboy
 * @email lsc11400@163.com
 * @date 2024-08-26 23:07:31
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
