package com.bubbleboy.modules.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.ware.dao.WmsWareSkuDao;
import com.bubbleboy.modules.ware.dto.WmsWareSkuDTO;
import com.bubbleboy.modules.ware.entity.WmsWareSkuEntity;
import com.bubbleboy.modules.ware.service.WmsWareSkuService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品库存
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class WmsWareSkuServiceImpl extends CrudServiceImpl<WmsWareSkuDao, WmsWareSkuEntity, WmsWareSkuDTO> implements WmsWareSkuService {

    @Override
    public QueryWrapper<WmsWareSkuEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<WmsWareSkuEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}