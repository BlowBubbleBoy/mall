
package com.bubbleboy.admin.modules.log.service;

import com.bubbleboy.common.page.PageData;
import com.bubbleboy.common.service.BaseService;
import com.bubbleboy.admin.modules.log.dto.SysLogLoginDTO;
import com.bubbleboy.admin.modules.log.entity.SysLogLoginEntity;

import java.util.List;
import java.util.Map;

/**
 * 登录日志
 */
public interface SysLogLoginService extends BaseService<SysLogLoginEntity> {

    PageData<SysLogLoginDTO> page(Map<String, Object> params);

    List<SysLogLoginDTO> list(Map<String, Object> params);

    void save(SysLogLoginEntity entity);
}