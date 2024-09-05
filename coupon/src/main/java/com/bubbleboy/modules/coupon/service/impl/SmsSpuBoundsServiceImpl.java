package com.bubbleboy.modules.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.coupon.dao.SmsSpuBoundsDao;
import com.bubbleboy.modules.coupon.dto.SmsSpuBoundsDTO;
import com.bubbleboy.modules.coupon.entity.SmsSpuBoundsEntity;
import com.bubbleboy.modules.coupon.service.SmsSpuBoundsService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class SmsSpuBoundsServiceImpl extends CrudServiceImpl<SmsSpuBoundsDao, SmsSpuBoundsEntity, SmsSpuBoundsDTO> implements SmsSpuBoundsService {

    @Override
    public QueryWrapper<SmsSpuBoundsEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsSpuBoundsEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}