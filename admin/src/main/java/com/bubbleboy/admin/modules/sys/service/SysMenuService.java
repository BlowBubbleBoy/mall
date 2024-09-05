
package com.bubbleboy.admin.modules.sys.service;


import com.bubbleboy.admin.modules.security.user.UserDetail;
import com.bubbleboy.admin.modules.sys.dto.SysMenuDTO;
import com.bubbleboy.admin.modules.sys.entity.SysMenuEntity;
import com.bubbleboy.common.service.BaseService;

import java.util.List;

/**
 * 菜单管理
 * 
 */
public interface SysMenuService extends BaseService<SysMenuEntity> {

	SysMenuDTO get(Long id);

	void save(SysMenuDTO dto);

	void update(SysMenuDTO dto);

	void delete(Long id);

	/**
	 * 菜单列表
	 *
	 * @param menuType 菜单类型
	 */
	List<SysMenuDTO> getAllMenuList(Integer menuType);

	/**
	 * 用户菜单列表
	 *
	 * @param user  用户
	 * @param menuType 菜单类型
	 */
	List<SysMenuDTO> getUserMenuList(UserDetail user, Integer menuType);

	/**
	 * 根据父菜单，查询子菜单
	 * @param pid  父菜单ID
	 */
	List<SysMenuDTO> getListPid(Long pid);
}
