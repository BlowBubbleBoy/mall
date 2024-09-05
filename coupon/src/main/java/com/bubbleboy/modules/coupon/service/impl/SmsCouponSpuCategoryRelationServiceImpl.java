package com.bubbleboy.modules.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.coupon.dao.SmsCouponSpuCategoryRelationDao;
import com.bubbleboy.modules.coupon.dto.SmsCouponSpuCategoryRelationDTO;
import com.bubbleboy.modules.coupon.entity.SmsCouponSpuCategoryRelationEntity;
import com.bubbleboy.modules.coupon.service.SmsCouponSpuCategoryRelationService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class SmsCouponSpuCategoryRelationServiceImpl extends CrudServiceImpl<SmsCouponSpuCategoryRelationDao, SmsCouponSpuCategoryRelationEntity, SmsCouponSpuCategoryRelationDTO> implements SmsCouponSpuCategoryRelationService {

    @Override
    public QueryWrapper<SmsCouponSpuCategoryRelationEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsCouponSpuCategoryRelationEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}