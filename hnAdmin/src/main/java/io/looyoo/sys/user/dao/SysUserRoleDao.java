package io.looyoo.sys.user.dao;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import io.looyoo.sys.user.entity.SysUserRoleEntity;

/**
 * 用户与角色对应关系
 * 
 * @author looyoo
 * @email service@gmail.com
 * @date 2016年9月18日 上午9:34:46
 */
public interface SysUserRoleDao  extends BaseMapper<SysUserRoleEntity> {
	
	/**
	 * 根据用户ID，获取角色ID列表
	 */
	List<Long> queryRoleIdList(Long userId);
}
