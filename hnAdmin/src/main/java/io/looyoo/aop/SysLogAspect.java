package io.looyoo.aop;

import java.lang.reflect.Method;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

import io.looyoo.aop.annotation.SysLogAnn;
import io.looyoo.common.common.utils.HttpContextUtils;
import io.looyoo.common.common.utils.IPUtils;
import io.looyoo.shiro.utils.ShiroUtils;
import io.looyoo.sys.log.entity.SysLogEntity;
import io.looyoo.sys.log.service.SysLogService;

/**
 * 系统日志，切面处理类
 * 
 * @author looyoo
 * @email service@gmail.com
 * @date 2017年3月8日 上午11:07:35
 */
@Aspect
@Component
public class SysLogAspect {
	@Autowired
	private SysLogService sysLogService;

	@Pointcut("@annotation(io.looyoo.aop.annotation.SysLogAnn)")
	public void logPointCut() {

	}

	@Before("logPointCut()")
	public void saveSysLog(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();

		SysLogEntity sysLog = new SysLogEntity();
		SysLogAnn syslog = method.getAnnotation(SysLogAnn.class);
		if (syslog != null) {
			// 注解上的描述
			sysLog.setOperation(syslog.value());
		}

		// 请求的方法名
		String className = joinPoint.getTarget().getClass().getName();
		String methodName = signature.getName();
		sysLog.setMethod(className + "." + methodName + "()");

		// 请求的参数
		Object[] args = joinPoint.getArgs();
		String params = JSON.toJSONString(args[0]);
		sysLog.setParams(params);

		// 获取request
		HttpServletRequest request = HttpContextUtils.getHttpServletRequest();
		// 设置IP地址
		sysLog.setIp(IPUtils.getIpAddr(request));

		// 用户名
		String username = ShiroUtils.getUserEntity().getUsername();
		sysLog.setUsername(username);

		sysLog.setCreateDate(new Date());
		// 保存系统日志
		sysLogService.insert(sysLog);
	}

}
