package io.looyoo.sys.log.dao;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import io.looyoo.sys.log.entity.SysLogEntity;

/**
 * 系统日志
 * 
 * @author looyoo
 * @email service@gmail.com
 * @date 2017-03-08 10:40:56
 */
public interface SysLogDao extends BaseMapper<SysLogEntity> {
	List<SysLogEntity> queryList(Pagination page, Map<String, Object> map);

	int queryTotal(Map<String, Object> map);

}
