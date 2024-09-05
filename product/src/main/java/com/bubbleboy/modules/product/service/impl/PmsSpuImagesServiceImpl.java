package com.bubbleboy.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.product.dao.PmsSpuImagesDao;
import com.bubbleboy.modules.product.dto.PmsSpuImagesDTO;
import com.bubbleboy.modules.product.entity.PmsSpuImagesEntity;
import com.bubbleboy.modules.product.service.PmsSpuImagesService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * spu图片
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class PmsSpuImagesServiceImpl extends CrudServiceImpl<PmsSpuImagesDao, PmsSpuImagesEntity, PmsSpuImagesDTO> implements PmsSpuImagesService {

    @Override
    public QueryWrapper<PmsSpuImagesEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsSpuImagesEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}