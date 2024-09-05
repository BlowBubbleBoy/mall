package com.bubbleboy.modules.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.coupon.dao.SmsSeckillSessionDao;
import com.bubbleboy.modules.coupon.dto.SmsSeckillSessionDTO;
import com.bubbleboy.modules.coupon.entity.SmsSeckillSessionEntity;
import com.bubbleboy.modules.coupon.service.SmsSeckillSessionService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class SmsSeckillSessionServiceImpl extends CrudServiceImpl<SmsSeckillSessionDao, SmsSeckillSessionEntity, SmsSeckillSessionDTO> implements SmsSeckillSessionService {

    @Override
    public QueryWrapper<SmsSeckillSessionEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsSeckillSessionEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}