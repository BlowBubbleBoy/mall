package com.bubbleboy.modules.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.ware.dao.WmsWareOrderTaskDetailDao;
import com.bubbleboy.modules.ware.dto.WmsWareOrderTaskDetailDTO;
import com.bubbleboy.modules.ware.entity.WmsWareOrderTaskDetailEntity;
import com.bubbleboy.modules.ware.service.WmsWareOrderTaskDetailService;
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
public class WmsWareOrderTaskDetailServiceImpl extends CrudServiceImpl<WmsWareOrderTaskDetailDao, WmsWareOrderTaskDetailEntity, WmsWareOrderTaskDetailDTO> implements WmsWareOrderTaskDetailService {

    @Override
    public QueryWrapper<WmsWareOrderTaskDetailEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<WmsWareOrderTaskDetailEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}