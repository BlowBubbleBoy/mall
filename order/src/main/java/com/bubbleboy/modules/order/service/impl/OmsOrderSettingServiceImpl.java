package com.bubbleboy.modules.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.order.dao.OmsOrderSettingDao;
import com.bubbleboy.modules.order.dto.OmsOrderSettingDTO;
import com.bubbleboy.modules.order.entity.OmsOrderSettingEntity;
import com.bubbleboy.modules.order.service.OmsOrderSettingService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class OmsOrderSettingServiceImpl extends CrudServiceImpl<OmsOrderSettingDao, OmsOrderSettingEntity, OmsOrderSettingDTO> implements OmsOrderSettingService {

    @Override
    public QueryWrapper<OmsOrderSettingEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<OmsOrderSettingEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}