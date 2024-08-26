package com.bubbleboy.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bubbleboy.common.utils.PageUtils;
import com.bubbleboy.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author bubbleboy
 * @email lsc11400@163.com
 * @date 2024-08-26 19:56:39
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

