package com.bubbleboy.modules.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.coupon.dao.SmsSeckillSkuNoticeDao;
import com.bubbleboy.modules.coupon.dto.SmsSeckillSkuNoticeDTO;
import com.bubbleboy.modules.coupon.entity.SmsSeckillSkuNoticeEntity;
import com.bubbleboy.modules.coupon.service.SmsSeckillSkuNoticeService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class SmsSeckillSkuNoticeServiceImpl extends CrudServiceImpl<SmsSeckillSkuNoticeDao, SmsSeckillSkuNoticeEntity, SmsSeckillSkuNoticeDTO> implements SmsSeckillSkuNoticeService {

    @Override
    public QueryWrapper<SmsSeckillSkuNoticeEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsSeckillSkuNoticeEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}