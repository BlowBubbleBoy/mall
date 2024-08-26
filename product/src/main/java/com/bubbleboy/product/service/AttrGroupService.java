package com.bubbleboy.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bubbleboy.common.utils.PageUtils;
import com.bubbleboy.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author bubbleboy
 * @email lsc11400@163.com
 * @date 2024-08-26 19:56:42
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

