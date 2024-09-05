package com.bubbleboy.modules.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.member.dao.UmsMemberCollectSpuDao;
import com.bubbleboy.modules.member.dto.UmsMemberCollectSpuDTO;
import com.bubbleboy.modules.member.entity.UmsMemberCollectSpuEntity;
import com.bubbleboy.modules.member.service.UmsMemberCollectSpuService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class UmsMemberCollectSpuServiceImpl extends CrudServiceImpl<UmsMemberCollectSpuDao, UmsMemberCollectSpuEntity, UmsMemberCollectSpuDTO> implements UmsMemberCollectSpuService {

    @Override
    public QueryWrapper<UmsMemberCollectSpuEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<UmsMemberCollectSpuEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}