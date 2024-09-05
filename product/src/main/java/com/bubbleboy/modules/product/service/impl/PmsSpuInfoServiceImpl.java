package com.bubbleboy.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.product.dao.PmsSpuInfoDao;
import com.bubbleboy.modules.product.dto.PmsSpuInfoDTO;
import com.bubbleboy.modules.product.entity.PmsSpuInfoEntity;
import com.bubbleboy.modules.product.service.PmsSpuInfoService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * spu信息
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class PmsSpuInfoServiceImpl extends CrudServiceImpl<PmsSpuInfoDao, PmsSpuInfoEntity, PmsSpuInfoDTO> implements PmsSpuInfoService {

    @Override
    public QueryWrapper<PmsSpuInfoEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsSpuInfoEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}