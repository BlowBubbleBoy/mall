package com.bubbleboy.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.product.dao.PmsSkuImagesDao;
import com.bubbleboy.modules.product.dto.PmsSkuImagesDTO;
import com.bubbleboy.modules.product.entity.PmsSkuImagesEntity;
import com.bubbleboy.modules.product.service.PmsSkuImagesService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * sku图片
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class PmsSkuImagesServiceImpl extends CrudServiceImpl<PmsSkuImagesDao, PmsSkuImagesEntity, PmsSkuImagesDTO> implements PmsSkuImagesService {

    @Override
    public QueryWrapper<PmsSkuImagesEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsSkuImagesEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}