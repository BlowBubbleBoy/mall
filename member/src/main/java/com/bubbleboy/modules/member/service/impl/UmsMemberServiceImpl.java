package com.bubbleboy.modules.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.member.dao.UmsMemberDao;
import com.bubbleboy.modules.member.dto.UmsMemberDTO;
import com.bubbleboy.modules.member.entity.UmsMemberEntity;
import com.bubbleboy.modules.member.service.UmsMemberService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 会员
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class UmsMemberServiceImpl extends CrudServiceImpl<UmsMemberDao, UmsMemberEntity, UmsMemberDTO> implements UmsMemberService {

    @Override
    public QueryWrapper<UmsMemberEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<UmsMemberEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}