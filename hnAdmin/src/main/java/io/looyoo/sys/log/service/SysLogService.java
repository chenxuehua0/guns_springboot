package io.looyoo.sys.log.service;

import com.baomidou.mybatisplus.service.IService;

import io.looyoo.common.common.utils.PageInfo;
import io.looyoo.sys.log.entity.SysLogEntity;

/**
 * 系统日志
 * 
 * @author looyoo
 * @email service@gmail.com
 * @date 2017-03-08 10:40:56
 */
public interface SysLogService extends IService<SysLogEntity> {

	SysLogEntity queryObject(Long id);

	void queryList(PageInfo pageInfo);

	void save(SysLogEntity sysLog);

	void update(SysLogEntity sysLog);

	void delete(Long id);

	void deleteBatch(Long[] ids);
}
