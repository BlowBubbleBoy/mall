
package com.bubbleboy.admin.modules.log.dao;


import com.bubbleboy.admin.modules.log.entity.SysLogErrorEntity;
import com.bubbleboy.common.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 异常日志
 */
@Mapper
public interface SysLogErrorDao extends BaseDao<SysLogErrorEntity> {
	
}
