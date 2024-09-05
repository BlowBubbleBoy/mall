package com.bubbleboy.modules.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.ware.dao.UndoLogDao;
import com.bubbleboy.modules.ware.dto.UndoLogDTO;
import com.bubbleboy.modules.ware.entity.UndoLogEntity;
import com.bubbleboy.modules.ware.service.UndoLogService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class UndoLogServiceImpl extends CrudServiceImpl<UndoLogDao, UndoLogEntity, UndoLogDTO> implements UndoLogService {

    @Override
    public QueryWrapper<UndoLogEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<UndoLogEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}