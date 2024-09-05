
package com.bubbleboy.admin.modules.job.dao;


import com.bubbleboy.admin.modules.job.entity.ScheduleJobEntity;
import com.bubbleboy.common.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * 定时任务
 */
@Mapper
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {
	
	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}
