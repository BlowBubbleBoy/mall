package com.bubbleboy.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.product.dao.PmsAttrGroupDao;
import com.bubbleboy.modules.product.dto.PmsAttrGroupDTO;
import com.bubbleboy.modules.product.entity.PmsAttrGroupEntity;
import com.bubbleboy.modules.product.service.PmsAttrGroupService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 属性分组
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class PmsAttrGroupServiceImpl extends CrudServiceImpl<PmsAttrGroupDao, PmsAttrGroupEntity, PmsAttrGroupDTO> implements PmsAttrGroupService {

    @Override
    public QueryWrapper<PmsAttrGroupEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsAttrGroupEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}