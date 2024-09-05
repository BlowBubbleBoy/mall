package com.bubbleboy.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.product.dao.PmsCategoryBrandRelationDao;
import com.bubbleboy.modules.product.dto.PmsCategoryBrandRelationDTO;
import com.bubbleboy.modules.product.entity.PmsCategoryBrandRelationEntity;
import com.bubbleboy.modules.product.service.PmsCategoryBrandRelationService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class PmsCategoryBrandRelationServiceImpl extends CrudServiceImpl<PmsCategoryBrandRelationDao, PmsCategoryBrandRelationEntity, PmsCategoryBrandRelationDTO> implements PmsCategoryBrandRelationService {

    @Override
    public QueryWrapper<PmsCategoryBrandRelationEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsCategoryBrandRelationEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}