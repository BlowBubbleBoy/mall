package com.bubbleboy.member.dao;

import com.bubbleboy.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author bubbleboy
 * @email lsc11400@163.com
 * @date 2024-08-26 23:04:05
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
