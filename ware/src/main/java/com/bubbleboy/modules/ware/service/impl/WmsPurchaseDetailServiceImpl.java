package com.bubbleboy.modules.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.ware.dao.WmsPurchaseDetailDao;
import com.bubbleboy.modules.ware.dto.WmsPurchaseDetailDTO;
import com.bubbleboy.modules.ware.entity.WmsPurchaseDetailEntity;
import com.bubbleboy.modules.ware.service.WmsPurchaseDetailService;
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
public class WmsPurchaseDetailServiceImpl extends CrudServiceImpl<WmsPurchaseDetailDao, WmsPurchaseDetailEntity, WmsPurchaseDetailDTO> implements WmsPurchaseDetailService {

    @Override
    public QueryWrapper<WmsPurchaseDetailEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<WmsPurchaseDetailEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}