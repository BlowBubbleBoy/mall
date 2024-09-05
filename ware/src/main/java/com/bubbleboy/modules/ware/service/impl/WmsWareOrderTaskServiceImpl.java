package com.bubbleboy.modules.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.ware.dao.WmsWareOrderTaskDao;
import com.bubbleboy.modules.ware.dto.WmsWareOrderTaskDTO;
import com.bubbleboy.modules.ware.entity.WmsWareOrderTaskEntity;
import com.bubbleboy.modules.ware.service.WmsWareOrderTaskService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class WmsWareOrderTaskServiceImpl extends CrudServiceImpl<WmsWareOrderTaskDao, WmsWareOrderTaskEntity, WmsWareOrderTaskDTO> implements WmsWareOrderTaskService {

    @Override
    public QueryWrapper<WmsWareOrderTaskEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<WmsWareOrderTaskEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}