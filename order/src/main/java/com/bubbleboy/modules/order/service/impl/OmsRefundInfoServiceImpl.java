package com.bubbleboy.modules.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.order.dao.OmsRefundInfoDao;
import com.bubbleboy.modules.order.dto.OmsRefundInfoDTO;
import com.bubbleboy.modules.order.entity.OmsRefundInfoEntity;
import com.bubbleboy.modules.order.service.OmsRefundInfoService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 退款信息
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class OmsRefundInfoServiceImpl extends CrudServiceImpl<OmsRefundInfoDao, OmsRefundInfoEntity, OmsRefundInfoDTO> implements OmsRefundInfoService {

    @Override
    public QueryWrapper<OmsRefundInfoEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<OmsRefundInfoEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}