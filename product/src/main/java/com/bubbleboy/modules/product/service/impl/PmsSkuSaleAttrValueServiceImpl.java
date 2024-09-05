package com.bubbleboy.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.product.dao.PmsSkuSaleAttrValueDao;
import com.bubbleboy.modules.product.dto.PmsSkuSaleAttrValueDTO;
import com.bubbleboy.modules.product.entity.PmsSkuSaleAttrValueEntity;
import com.bubbleboy.modules.product.service.PmsSkuSaleAttrValueService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class PmsSkuSaleAttrValueServiceImpl extends CrudServiceImpl<PmsSkuSaleAttrValueDao, PmsSkuSaleAttrValueEntity, PmsSkuSaleAttrValueDTO> implements PmsSkuSaleAttrValueService {

    @Override
    public QueryWrapper<PmsSkuSaleAttrValueEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsSkuSaleAttrValueEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}