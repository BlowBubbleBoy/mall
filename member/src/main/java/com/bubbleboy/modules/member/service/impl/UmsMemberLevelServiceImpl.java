package com.bubbleboy.modules.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.member.dao.UmsMemberLevelDao;
import com.bubbleboy.modules.member.dto.UmsMemberLevelDTO;
import com.bubbleboy.modules.member.entity.UmsMemberLevelEntity;
import com.bubbleboy.modules.member.service.UmsMemberLevelService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 会员等级
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class UmsMemberLevelServiceImpl extends CrudServiceImpl<UmsMemberLevelDao, UmsMemberLevelEntity, UmsMemberLevelDTO> implements UmsMemberLevelService {

    @Override
    public QueryWrapper<UmsMemberLevelEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<UmsMemberLevelEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}