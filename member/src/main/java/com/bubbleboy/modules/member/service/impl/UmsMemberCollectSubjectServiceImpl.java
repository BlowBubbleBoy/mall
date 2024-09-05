package com.bubbleboy.modules.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.member.dao.UmsMemberCollectSubjectDao;
import com.bubbleboy.modules.member.dto.UmsMemberCollectSubjectDTO;
import com.bubbleboy.modules.member.entity.UmsMemberCollectSubjectEntity;
import com.bubbleboy.modules.member.service.UmsMemberCollectSubjectService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class UmsMemberCollectSubjectServiceImpl extends CrudServiceImpl<UmsMemberCollectSubjectDao, UmsMemberCollectSubjectEntity, UmsMemberCollectSubjectDTO> implements UmsMemberCollectSubjectService {

    @Override
    public QueryWrapper<UmsMemberCollectSubjectEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<UmsMemberCollectSubjectEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}