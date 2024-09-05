package com.bubbleboy.modules.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.coupon.dao.SmsHomeSubjectSpuDao;
import com.bubbleboy.modules.coupon.dto.SmsHomeSubjectSpuDTO;
import com.bubbleboy.modules.coupon.entity.SmsHomeSubjectSpuEntity;
import com.bubbleboy.modules.coupon.service.SmsHomeSubjectSpuService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 专题商品
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class SmsHomeSubjectSpuServiceImpl extends CrudServiceImpl<SmsHomeSubjectSpuDao, SmsHomeSubjectSpuEntity, SmsHomeSubjectSpuDTO> implements SmsHomeSubjectSpuService {

    @Override
    public QueryWrapper<SmsHomeSubjectSpuEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsHomeSubjectSpuEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}