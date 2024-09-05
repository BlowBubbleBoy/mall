package com.bubbleboy.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.product.dao.PmsSpuInfoDescDao;
import com.bubbleboy.modules.product.dto.PmsSpuInfoDescDTO;
import com.bubbleboy.modules.product.entity.PmsSpuInfoDescEntity;
import com.bubbleboy.modules.product.service.PmsSpuInfoDescService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class PmsSpuInfoDescServiceImpl extends CrudServiceImpl<PmsSpuInfoDescDao, PmsSpuInfoDescEntity, PmsSpuInfoDescDTO> implements PmsSpuInfoDescService {

    @Override
    public QueryWrapper<PmsSpuInfoDescEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsSpuInfoDescEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}