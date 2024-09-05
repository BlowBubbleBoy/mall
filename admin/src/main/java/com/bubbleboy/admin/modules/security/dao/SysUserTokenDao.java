
package com.bubbleboy.admin.modules.security.dao;


import com.bubbleboy.admin.modules.security.entity.SysUserTokenEntity;
import com.bubbleboy.common.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 系统用户Token
 * 
 */
@Mapper
public interface SysUserTokenDao extends BaseDao<SysUserTokenEntity> {

    SysUserTokenEntity getByToken(String token);

    SysUserTokenEntity getByUserId(Long userId);

    void updateToken(@Param("userId") Long userId, @Param("token") String token);
}
