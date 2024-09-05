package com.bubbleboy.modules.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.member.dao.UmsMemberLoginLogDao;
import com.bubbleboy.modules.member.dto.UmsMemberLoginLogDTO;
import com.bubbleboy.modules.member.entity.UmsMemberLoginLogEntity;
import com.bubbleboy.modules.member.service.UmsMemberLoginLogService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class UmsMemberLoginLogServiceImpl extends CrudServiceImpl<UmsMemberLoginLogDao, UmsMemberLoginLogEntity, UmsMemberLoginLogDTO> implements UmsMemberLoginLogService {

    @Override
    public QueryWrapper<UmsMemberLoginLogEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<UmsMemberLoginLogEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}