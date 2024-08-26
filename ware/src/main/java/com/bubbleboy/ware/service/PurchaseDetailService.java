package com.bubbleboy.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bubbleboy.common.utils.PageUtils;
import com.bubbleboy.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author bubbleboy
 * @email lsc11400@163.com
 * @date 2024-08-26 23:02:08
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

