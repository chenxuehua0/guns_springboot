package io.looyoo.sys.schedule.dao;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import io.looyoo.sys.schedule.entity.ScheduleJobEntity;

/**
 * 定时任务
 * 
 * @author looyoo
 * @email service@gmail.com
 * @date 2016年12月1日 下午10:29:57
 */
public interface ScheduleJobDao extends BaseMapper<ScheduleJobEntity> {

	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);

	List<ScheduleJobEntity> queryList(Pagination page, Map<String, Object> map);

	void deleteBatch(Long[] jobIds);
	int queryTotal(Map<String, Object> map);
}
