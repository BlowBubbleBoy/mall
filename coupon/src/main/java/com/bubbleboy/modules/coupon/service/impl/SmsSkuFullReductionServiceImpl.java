package com.bubbleboy.modules.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.coupon.dao.SmsSkuFullReductionDao;
import com.bubbleboy.modules.coupon.dto.SmsSkuFullReductionDTO;
import com.bubbleboy.modules.coupon.entity.SmsSkuFullReductionEntity;
import com.bubbleboy.modules.coupon.service.SmsSkuFullReductionService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class SmsSkuFullReductionServiceImpl extends CrudServiceImpl<SmsSkuFullReductionDao, SmsSkuFullReductionEntity, SmsSkuFullReductionDTO> implements SmsSkuFullReductionService {

    @Override
    public QueryWrapper<SmsSkuFullReductionEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsSkuFullReductionEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}