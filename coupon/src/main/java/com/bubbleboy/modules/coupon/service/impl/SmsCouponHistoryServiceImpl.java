package com.bubbleboy.modules.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.coupon.dao.SmsCouponHistoryDao;
import com.bubbleboy.modules.coupon.dto.SmsCouponHistoryDTO;
import com.bubbleboy.modules.coupon.entity.SmsCouponHistoryEntity;
import com.bubbleboy.modules.coupon.service.SmsCouponHistoryService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class SmsCouponHistoryServiceImpl extends CrudServiceImpl<SmsCouponHistoryDao, SmsCouponHistoryEntity, SmsCouponHistoryDTO> implements SmsCouponHistoryService {

    @Override
    public QueryWrapper<SmsCouponHistoryEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsCouponHistoryEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}