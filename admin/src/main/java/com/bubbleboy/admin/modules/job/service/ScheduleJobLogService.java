
package com.bubbleboy.admin.modules.job.service;


import com.bubbleboy.admin.modules.job.dto.ScheduleJobLogDTO;
import com.bubbleboy.admin.modules.job.entity.ScheduleJobLogEntity;
import com.bubbleboy.common.page.PageData;
import com.bubbleboy.common.service.BaseService;

import java.util.Map;

/**
 * 定时任务日志
 */
public interface ScheduleJobLogService extends BaseService<ScheduleJobLogEntity> {

	PageData<ScheduleJobLogDTO> page(Map<String, Object> params);

	ScheduleJobLogDTO get(Long id);
}
