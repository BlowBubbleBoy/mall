package com.bubbleboy.modules.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.coupon.dao.SmsSeckillSkuRelationDao;
import com.bubbleboy.modules.coupon.dto.SmsSeckillSkuRelationDTO;
import com.bubbleboy.modules.coupon.entity.SmsSeckillSkuRelationEntity;
import com.bubbleboy.modules.coupon.service.SmsSeckillSkuRelationService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class SmsSeckillSkuRelationServiceImpl extends CrudServiceImpl<SmsSeckillSkuRelationDao, SmsSeckillSkuRelationEntity, SmsSeckillSkuRelationDTO> implements SmsSeckillSkuRelationService {

    @Override
    public QueryWrapper<SmsSeckillSkuRelationEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsSeckillSkuRelationEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}