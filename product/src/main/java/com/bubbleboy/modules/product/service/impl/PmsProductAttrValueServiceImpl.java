package com.bubbleboy.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.product.dao.PmsProductAttrValueDao;
import com.bubbleboy.modules.product.dto.PmsProductAttrValueDTO;
import com.bubbleboy.modules.product.entity.PmsProductAttrValueEntity;
import com.bubbleboy.modules.product.service.PmsProductAttrValueService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * spu属性值
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class PmsProductAttrValueServiceImpl extends CrudServiceImpl<PmsProductAttrValueDao, PmsProductAttrValueEntity, PmsProductAttrValueDTO> implements PmsProductAttrValueService {

    @Override
    public QueryWrapper<PmsProductAttrValueEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsProductAttrValueEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}