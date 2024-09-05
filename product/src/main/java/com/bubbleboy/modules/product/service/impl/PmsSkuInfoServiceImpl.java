package com.bubbleboy.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.product.dao.PmsSkuInfoDao;
import com.bubbleboy.modules.product.dto.PmsSkuInfoDTO;
import com.bubbleboy.modules.product.entity.PmsSkuInfoEntity;
import com.bubbleboy.modules.product.service.PmsSkuInfoService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * sku信息
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class PmsSkuInfoServiceImpl extends CrudServiceImpl<PmsSkuInfoDao, PmsSkuInfoEntity, PmsSkuInfoDTO> implements PmsSkuInfoService {

    @Override
    public QueryWrapper<PmsSkuInfoEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsSkuInfoEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}