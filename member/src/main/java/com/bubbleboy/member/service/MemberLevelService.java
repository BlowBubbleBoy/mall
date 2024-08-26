package com.bubbleboy.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bubbleboy.common.utils.PageUtils;
import com.bubbleboy.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author bubbleboy
 * @email lsc11400@163.com
 * @date 2024-08-26 23:04:04
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

