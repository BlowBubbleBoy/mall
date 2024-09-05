package com.bubbleboy.modules.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.coupon.dao.SmsSkuLadderDao;
import com.bubbleboy.modules.coupon.dto.SmsSkuLadderDTO;
import com.bubbleboy.modules.coupon.entity.SmsSkuLadderEntity;
import com.bubbleboy.modules.coupon.service.SmsSkuLadderService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class SmsSkuLadderServiceImpl extends CrudServiceImpl<SmsSkuLadderDao, SmsSkuLadderEntity, SmsSkuLadderDTO> implements SmsSkuLadderService {

    @Override
    public QueryWrapper<SmsSkuLadderEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsSkuLadderEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}