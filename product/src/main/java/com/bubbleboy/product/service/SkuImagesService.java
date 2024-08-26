package com.bubbleboy.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bubbleboy.common.utils.PageUtils;
import com.bubbleboy.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author bubbleboy
 * @email lsc11400@163.com
 * @date 2024-08-26 19:56:40
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

