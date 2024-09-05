
package com.bubbleboy.admin.modules.job.dao;


import com.bubbleboy.admin.modules.job.entity.ScheduleJobLogEntity;
import com.bubbleboy.common.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 */
@Mapper
public interface ScheduleJobLogDao extends BaseDao<ScheduleJobLogEntity> {
	
}
