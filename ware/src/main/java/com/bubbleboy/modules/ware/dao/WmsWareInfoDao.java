package com.bubbleboy.modules.ware.dao;

import com.bubbleboy.common.dao.BaseDao;
import com.bubbleboy.modules.ware.entity.WmsWareInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Mapper
public interface WmsWareInfoDao extends BaseDao<WmsWareInfoEntity> {
	
}