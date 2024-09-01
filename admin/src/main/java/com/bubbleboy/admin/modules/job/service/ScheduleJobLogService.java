/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.bubbleboy.admin.modules.job.service;


import com.bubbleboy.admin.modules.job.dto.ScheduleJobLogDTO;
import com.bubbleboy.admin.modules.job.entity.ScheduleJobLogEntity;
import com.bubbleboy.common.page.PageData;
import com.bubbleboy.common.service.BaseService;

import java.util.Map;

/**
 * 定时任务日志
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface ScheduleJobLogService extends BaseService<ScheduleJobLogEntity> {

	PageData<ScheduleJobLogDTO> page(Map<String, Object> params);

	ScheduleJobLogDTO get(Long id);
}
