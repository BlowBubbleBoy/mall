package com.bubbleboy.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bubbleboy.common.utils.PageUtils;
import com.bubbleboy.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author bubbleboy
 * @email lsc11400@163.com
 * @date 2024-08-26 23:02:07
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

