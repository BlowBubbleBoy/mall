
package com.bubbleboy.admin.modules.log.service;


import com.bubbleboy.admin.modules.log.dto.SysLogOperationDTO;
import com.bubbleboy.admin.modules.log.entity.SysLogOperationEntity;
import com.bubbleboy.common.page.PageData;
import com.bubbleboy.common.service.BaseService;

import java.util.List;
import java.util.Map;

/**
 * 操作日志
 */
public interface SysLogOperationService extends BaseService<SysLogOperationEntity> {

    PageData<SysLogOperationDTO> page(Map<String, Object> params);

    List<SysLogOperationDTO> list(Map<String, Object> params);

    void save(SysLogOperationEntity entity);
}