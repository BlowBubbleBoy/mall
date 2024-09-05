
package com.bubbleboy.admin.modules.sys.service;


import com.bubbleboy.admin.modules.sys.dto.SysDictDataDTO;
import com.bubbleboy.admin.modules.sys.entity.SysDictDataEntity;
import com.bubbleboy.common.page.PageData;
import com.bubbleboy.common.service.BaseService;

import java.util.Map;

/**
 * 数据字典
 */
public interface SysDictDataService extends BaseService<SysDictDataEntity> {

    PageData<SysDictDataDTO> page(Map<String, Object> params);

    SysDictDataDTO get(Long id);

    void save(SysDictDataDTO dto);

    void update(SysDictDataDTO dto);

    void delete(Long[] ids);

}