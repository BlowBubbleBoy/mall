package com.bubbleboy.modules.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.order.dao.OmsOrderReturnReasonDao;
import com.bubbleboy.modules.order.dto.OmsOrderReturnReasonDTO;
import com.bubbleboy.modules.order.entity.OmsOrderReturnReasonEntity;
import com.bubbleboy.modules.order.service.OmsOrderReturnReasonService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 退货原因
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class OmsOrderReturnReasonServiceImpl extends CrudServiceImpl<OmsOrderReturnReasonDao, OmsOrderReturnReasonEntity, OmsOrderReturnReasonDTO> implements OmsOrderReturnReasonService {

    @Override
    public QueryWrapper<OmsOrderReturnReasonEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<OmsOrderReturnReasonEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}