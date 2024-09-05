package com.bubbleboy.modules.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.coupon.dao.SmsSeckillPromotionDao;
import com.bubbleboy.modules.coupon.dto.SmsSeckillPromotionDTO;
import com.bubbleboy.modules.coupon.entity.SmsSeckillPromotionEntity;
import com.bubbleboy.modules.coupon.service.SmsSeckillPromotionService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class SmsSeckillPromotionServiceImpl extends CrudServiceImpl<SmsSeckillPromotionDao, SmsSeckillPromotionEntity, SmsSeckillPromotionDTO> implements SmsSeckillPromotionService {

    @Override
    public QueryWrapper<SmsSeckillPromotionEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsSeckillPromotionEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}