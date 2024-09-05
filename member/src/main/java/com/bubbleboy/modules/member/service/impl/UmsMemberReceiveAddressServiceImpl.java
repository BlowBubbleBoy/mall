package com.bubbleboy.modules.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.member.dao.UmsMemberReceiveAddressDao;
import com.bubbleboy.modules.member.dto.UmsMemberReceiveAddressDTO;
import com.bubbleboy.modules.member.entity.UmsMemberReceiveAddressEntity;
import com.bubbleboy.modules.member.service.UmsMemberReceiveAddressService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class UmsMemberReceiveAddressServiceImpl extends CrudServiceImpl<UmsMemberReceiveAddressDao, UmsMemberReceiveAddressEntity, UmsMemberReceiveAddressDTO> implements UmsMemberReceiveAddressService {

    @Override
    public QueryWrapper<UmsMemberReceiveAddressEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<UmsMemberReceiveAddressEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}