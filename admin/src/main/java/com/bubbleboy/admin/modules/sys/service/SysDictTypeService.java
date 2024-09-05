
package com.bubbleboy.admin.modules.sys.service;


import com.bubbleboy.admin.modules.sys.dto.SysDictTypeDTO;
import com.bubbleboy.admin.modules.sys.entity.DictType;
import com.bubbleboy.admin.modules.sys.entity.SysDictTypeEntity;
import com.bubbleboy.common.page.PageData;
import com.bubbleboy.common.service.BaseService;

import java.util.List;
import java.util.Map;

/**
 * 数据字典
 */
public interface SysDictTypeService extends BaseService<SysDictTypeEntity> {

    PageData<SysDictTypeDTO> page(Map<String, Object> params);

    SysDictTypeDTO get(Long id);

    void save(SysDictTypeDTO dto);

    void update(SysDictTypeDTO dto);

    void delete(Long[] ids);

    /**
     * 获取所有字典
     */
    List<DictType> getAllList();

}