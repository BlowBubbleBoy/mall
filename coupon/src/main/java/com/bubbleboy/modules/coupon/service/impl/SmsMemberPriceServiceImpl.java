package com.bubbleboy.modules.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.coupon.dao.SmsMemberPriceDao;
import com.bubbleboy.modules.coupon.dto.SmsMemberPriceDTO;
import com.bubbleboy.modules.coupon.entity.SmsMemberPriceEntity;
import com.bubbleboy.modules.coupon.service.SmsMemberPriceService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class SmsMemberPriceServiceImpl extends CrudServiceImpl<SmsMemberPriceDao, SmsMemberPriceEntity, SmsMemberPriceDTO> implements SmsMemberPriceService {

    @Override
    public QueryWrapper<SmsMemberPriceEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsMemberPriceEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}