package com.bubbleboy.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.product.dao.PmsCommentReplayDao;
import com.bubbleboy.modules.product.dto.PmsCommentReplayDTO;
import com.bubbleboy.modules.product.entity.PmsCommentReplayEntity;
import com.bubbleboy.modules.product.service.PmsCommentReplayService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class PmsCommentReplayServiceImpl extends CrudServiceImpl<PmsCommentReplayDao, PmsCommentReplayEntity, PmsCommentReplayDTO> implements PmsCommentReplayService {

    @Override
    public QueryWrapper<PmsCommentReplayEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsCommentReplayEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}