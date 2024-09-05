package com.bubbleboy.modules.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.coupon.dao.SmsCouponDao;
import com.bubbleboy.modules.coupon.dto.SmsCouponDTO;
import com.bubbleboy.modules.coupon.entity.SmsCouponEntity;
import com.bubbleboy.modules.coupon.service.SmsCouponService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class SmsCouponServiceImpl extends CrudServiceImpl<SmsCouponDao, SmsCouponEntity, SmsCouponDTO> implements SmsCouponService {

    @Override
    public QueryWrapper<SmsCouponEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsCouponEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}