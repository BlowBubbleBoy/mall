
package com.bubbleboy.admin.modules.log.dao;


import com.bubbleboy.admin.modules.log.entity.SysLogLoginEntity;
import com.bubbleboy.common.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 登录日志
 */
@Mapper
public interface SysLogLoginDao extends BaseDao<SysLogLoginEntity> {
	
}
