
package com.bubbleboy.admin.modules.security.service;

import com.bubbleboy.common.service.BaseService;
import com.bubbleboy.common.utils.Result;
import com.bubbleboy.admin.modules.security.entity.SysUserTokenEntity;

/**
 * 用户Token
 * 
 */
public interface SysUserTokenService extends BaseService<SysUserTokenEntity> {

	/**
	 * 生成token
	 * @param userId  用户ID
	 */
	Result createToken(Long userId);

	/**
	 * 退出，修改token值
	 * @param userId  用户ID
	 */
	void logout(Long userId);

}