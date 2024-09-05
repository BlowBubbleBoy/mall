
package com.bubbleboy.admin.modules.sys.dao;


import com.bubbleboy.admin.modules.sys.entity.DictType;
import com.bubbleboy.admin.modules.sys.entity.SysDictTypeEntity;
import com.bubbleboy.common.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 字典类型
 */
@Mapper
public interface SysDictTypeDao extends BaseDao<SysDictTypeEntity> {

    /**
     * 字典类型列表
     */
    List<DictType> getDictTypeList();

}
