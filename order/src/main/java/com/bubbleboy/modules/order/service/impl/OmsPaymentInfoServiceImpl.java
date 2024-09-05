package com.bubbleboy.modules.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.order.dao.OmsPaymentInfoDao;
import com.bubbleboy.modules.order.dto.OmsPaymentInfoDTO;
import com.bubbleboy.modules.order.entity.OmsPaymentInfoEntity;
import com.bubbleboy.modules.order.service.OmsPaymentInfoService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class OmsPaymentInfoServiceImpl extends CrudServiceImpl<OmsPaymentInfoDao, OmsPaymentInfoEntity, OmsPaymentInfoDTO> implements OmsPaymentInfoService {

    @Override
    public QueryWrapper<OmsPaymentInfoEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<OmsPaymentInfoEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}