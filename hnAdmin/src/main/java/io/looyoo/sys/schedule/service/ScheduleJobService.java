package io.looyoo.sys.schedule.service;

import com.baomidou.mybatisplus.service.IService;

import io.looyoo.common.common.utils.PageInfo;
import io.looyoo.sys.schedule.entity.ScheduleJobEntity;

/**
 * 定时任务
 * 
 * @author looyoo
 * @email service@gmail.com
 * @date 2016年11月28日 上午9:55:32
 */
public interface ScheduleJobService  extends IService<ScheduleJobEntity>{

	/**
	 * 根据ID，查询定时任务
	 */
	ScheduleJobEntity queryObject(Long jobId);
	
	/**
	 * 查询定时任务列表
	 */
	void queryList(PageInfo pageInfo);
	
	/**
	 * 保存定时任务
	 */
	void save(ScheduleJobEntity scheduleJob);
	
	/**
	 * 更新定时任务
	 */
	void update(ScheduleJobEntity scheduleJob);
	
	/**
	 * 批量删除定时任务
	 */
	void deleteBatch(Long[] jobIds);
	
	/**
	 * 批量更新定时任务状态
	 */
	int updateBatch(Long[] jobIds, int status);
	
	/**
	 * 立即执行
	 */
	void run(Long[] jobIds);
	
	/**
	 * 暂停运行
	 */
	void pause(Long[] jobIds);
	
	/**
	 * 恢复运行
	 */
	void resume(Long[] jobIds);
}