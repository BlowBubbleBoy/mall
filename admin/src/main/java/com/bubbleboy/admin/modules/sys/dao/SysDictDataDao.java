
package com.bubbleboy.admin.modules.sys.dao;


import com.bubbleboy.admin.modules.sys.entity.DictData;
import com.bubbleboy.admin.modules.sys.entity.SysDictDataEntity;
import com.bubbleboy.common.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 字典数据
 */
@Mapper
public interface SysDictDataDao extends BaseDao<SysDictDataEntity> {

    /**
     * 字典数据列表
     */
    List<DictData> getDictDataList();
}
