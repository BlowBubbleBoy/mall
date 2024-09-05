
package com.bubbleboy.admin.modules.log.service;


import com.bubbleboy.admin.modules.log.dto.SysLogErrorDTO;
import com.bubbleboy.admin.modules.log.entity.SysLogErrorEntity;
import com.bubbleboy.common.page.PageData;
import com.bubbleboy.common.service.BaseService;

import java.util.List;
import java.util.Map;

/**
 * 异常日志
 */
public interface SysLogErrorService extends BaseService<SysLogErrorEntity> {

    PageData<SysLogErrorDTO> page(Map<String, Object> params);

    List<SysLogErrorDTO> list(Map<String, Object> params);

    void save(SysLogErrorEntity entity);

}