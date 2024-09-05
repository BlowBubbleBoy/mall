
package com.bubbleboy.admin.modules.log.dao;


import com.bubbleboy.admin.modules.log.entity.SysLogOperationEntity;
import com.bubbleboy.common.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 操作日志
 */
@Mapper
public interface SysLogOperationDao extends BaseDao<SysLogOperationEntity> {
	
}
