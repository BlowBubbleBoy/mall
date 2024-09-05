package com.bubbleboy.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.product.dao.PmsSpuCommentDao;
import com.bubbleboy.modules.product.dto.PmsSpuCommentDTO;
import com.bubbleboy.modules.product.entity.PmsSpuCommentEntity;
import com.bubbleboy.modules.product.service.PmsSpuCommentService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品评价
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class PmsSpuCommentServiceImpl extends CrudServiceImpl<PmsSpuCommentDao, PmsSpuCommentEntity, PmsSpuCommentDTO> implements PmsSpuCommentService {

    @Override
    public QueryWrapper<PmsSpuCommentEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsSpuCommentEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}