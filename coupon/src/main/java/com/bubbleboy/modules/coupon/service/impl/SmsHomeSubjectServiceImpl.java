package com.bubbleboy.modules.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.coupon.dao.SmsHomeSubjectDao;
import com.bubbleboy.modules.coupon.dto.SmsHomeSubjectDTO;
import com.bubbleboy.modules.coupon.entity.SmsHomeSubjectEntity;
import com.bubbleboy.modules.coupon.service.SmsHomeSubjectService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class SmsHomeSubjectServiceImpl extends CrudServiceImpl<SmsHomeSubjectDao, SmsHomeSubjectEntity, SmsHomeSubjectDTO> implements SmsHomeSubjectService {

    @Override
    public QueryWrapper<SmsHomeSubjectEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SmsHomeSubjectEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}