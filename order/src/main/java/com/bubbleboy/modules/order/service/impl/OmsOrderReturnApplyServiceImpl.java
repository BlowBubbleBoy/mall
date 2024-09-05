package com.bubbleboy.modules.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.order.dao.OmsOrderReturnApplyDao;
import com.bubbleboy.modules.order.dto.OmsOrderReturnApplyDTO;
import com.bubbleboy.modules.order.entity.OmsOrderReturnApplyEntity;
import com.bubbleboy.modules.order.service.OmsOrderReturnApplyService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class OmsOrderReturnApplyServiceImpl extends CrudServiceImpl<OmsOrderReturnApplyDao, OmsOrderReturnApplyEntity, OmsOrderReturnApplyDTO> implements OmsOrderReturnApplyService {

    @Override
    public QueryWrapper<OmsOrderReturnApplyEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<OmsOrderReturnApplyEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}