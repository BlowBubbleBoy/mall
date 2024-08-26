package com.bubbleboy.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bubbleboy.common.utils.PageUtils;
import com.bubbleboy.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author bubbleboy
 * @email lsc11400@163.com
 * @date 2024-08-26 19:56:43
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

