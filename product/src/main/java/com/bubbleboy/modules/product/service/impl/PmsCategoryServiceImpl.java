package com.bubbleboy.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.product.dao.PmsCategoryDao;
import com.bubbleboy.modules.product.dto.PmsCategoryDTO;
import com.bubbleboy.modules.product.entity.PmsCategoryEntity;
import com.bubbleboy.modules.product.service.PmsCategoryService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class PmsCategoryServiceImpl extends CrudServiceImpl<PmsCategoryDao, PmsCategoryEntity, PmsCategoryDTO> implements PmsCategoryService {

    @Override
    public QueryWrapper<PmsCategoryEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsCategoryEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}