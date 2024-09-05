package com.bubbleboy.modules.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.coupon.dao.SmsCouponSpuRelationDao;
import com.bubbleboy.modules.coupon.dto.SmsCouponSpuRelationDTO;
import com.bubbleboy.modules.coupon.entity.SmsCouponSpuRelationEntity;
import com.bubbleboy.modules.coupon.service.SmsCouponSpuRelationService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class SmsCouponSpuRelationServiceImpl extends CrudServiceImpl<SmsCouponSpuRelationDao, SmsCouponSpuRelationEntity, SmsCouponSpuRelationDTO> implements SmsCouponSpuRelationService {

    @Override
    public QueryWrapper<SmsCouponSpuRelationEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsCouponSpuRelationEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}