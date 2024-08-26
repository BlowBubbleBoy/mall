package com.bubbleboy.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bubbleboy.common.utils.PageUtils;
import com.bubbleboy.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author bubbleboy
 * @email lsc11400@163.com
 * @date 2024-08-26 23:04:05
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

