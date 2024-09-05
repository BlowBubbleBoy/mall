
package com.bubbleboy.admin.modules.oss.service;

import com.bubbleboy.common.page.PageData;
import com.bubbleboy.common.service.BaseService;
import com.bubbleboy.admin.modules.oss.entity.SysOssEntity;

import java.util.Map;

/**
 * 文件上传
 * 
 */
public interface SysOssService extends BaseService<SysOssEntity> {

	PageData<SysOssEntity> page(Map<String, Object> params);
}
