package com.bubbleboy.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.product.dao.PmsAttrDao;
import com.bubbleboy.modules.product.dto.PmsAttrDTO;
import com.bubbleboy.modules.product.entity.PmsAttrEntity;
import com.bubbleboy.modules.product.service.PmsAttrService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品属性
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class PmsAttrServiceImpl extends CrudServiceImpl<PmsAttrDao, PmsAttrEntity, PmsAttrDTO> implements PmsAttrService {

    @Override
    public QueryWrapper<PmsAttrEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsAttrEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}