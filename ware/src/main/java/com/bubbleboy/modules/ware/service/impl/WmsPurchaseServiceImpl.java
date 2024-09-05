package com.bubbleboy.modules.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.ware.dao.WmsPurchaseDao;
import com.bubbleboy.modules.ware.dto.WmsPurchaseDTO;
import com.bubbleboy.modules.ware.entity.WmsPurchaseEntity;
import com.bubbleboy.modules.ware.service.WmsPurchaseService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 采购信息
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class WmsPurchaseServiceImpl extends CrudServiceImpl<WmsPurchaseDao, WmsPurchaseEntity, WmsPurchaseDTO> implements WmsPurchaseService {

    @Override
    public QueryWrapper<WmsPurchaseEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<WmsPurchaseEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}