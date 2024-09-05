package com.bubbleboy.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.product.dao.PmsBrandDao;
import com.bubbleboy.modules.product.dto.PmsBrandDTO;
import com.bubbleboy.modules.product.entity.PmsBrandEntity;
import com.bubbleboy.modules.product.service.PmsBrandService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 品牌
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class PmsBrandServiceImpl extends CrudServiceImpl<PmsBrandDao, PmsBrandEntity, PmsBrandDTO> implements PmsBrandService {

    @Override
    public QueryWrapper<PmsBrandEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsBrandEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}