package io.looyoo.sys.role.dao;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import io.looyoo.sys.role.entity.SysRoleMenuEntity;

/**
 * 角色与菜单对应关系
 * 
 * @author looyoo
 * @email service@gmail.com
 * @date 2016年9月18日 上午9:33:46
 */
public interface SysRoleMenuDao extends BaseMapper<SysRoleMenuEntity> {
	
	/**
	 * 根据角色ID，获取菜单ID列表
	 */
	List<Long> queryMenuIdList(Long roleId);
}
