package io.looyoo.sys.base.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.looyoo.shiro.utils.ShiroUtils;
import io.looyoo.sys.user.entity.SysUserEntity;

/**
 * Controller公共组件
 * 
 * @author looyoo
 * @email service@gmail.com
 * @date 2016年11月9日 下午9:42:26
 */
public abstract class AbstractController {
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	protected SysUserEntity getUser() {
		return ShiroUtils.getUserEntity();
	}

	protected Long getUserId() {
		return getUser().getUserId();
	}
}
