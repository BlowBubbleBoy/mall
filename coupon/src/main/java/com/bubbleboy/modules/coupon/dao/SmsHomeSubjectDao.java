package com.bubbleboy.modules.coupon.dao;

import com.bubbleboy.common.dao.BaseDao;
import com.bubbleboy.modules.coupon.entity.SmsHomeSubjectEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Mapper
public interface SmsHomeSubjectDao extends BaseDao<SmsHomeSubjectEntity> {
	
}