package com.bubbleboy.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.product.dao.PmsAttrAttrgroupRelationDao;
import com.bubbleboy.modules.product.dto.PmsAttrAttrgroupRelationDTO;
import com.bubbleboy.modules.product.entity.PmsAttrAttrgroupRelationEntity;
import com.bubbleboy.modules.product.service.PmsAttrAttrgroupRelationService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class PmsAttrAttrgroupRelationServiceImpl extends CrudServiceImpl<PmsAttrAttrgroupRelationDao, PmsAttrAttrgroupRelationEntity, PmsAttrAttrgroupRelationDTO> implements PmsAttrAttrgroupRelationService {

    @Override
    public QueryWrapper<PmsAttrAttrgroupRelationEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsAttrAttrgroupRelationEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}