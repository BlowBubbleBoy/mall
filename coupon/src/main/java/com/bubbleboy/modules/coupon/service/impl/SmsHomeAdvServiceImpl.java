package com.bubbleboy.modules.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.coupon.dao.SmsHomeAdvDao;
import com.bubbleboy.modules.coupon.dto.SmsHomeAdvDTO;
import com.bubbleboy.modules.coupon.entity.SmsHomeAdvEntity;
import com.bubbleboy.modules.coupon.service.SmsHomeAdvService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class SmsHomeAdvServiceImpl extends CrudServiceImpl<SmsHomeAdvDao, SmsHomeAdvEntity, SmsHomeAdvDTO> implements SmsHomeAdvService {

    @Override
    public QueryWrapper<SmsHomeAdvEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsHomeAdvEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}