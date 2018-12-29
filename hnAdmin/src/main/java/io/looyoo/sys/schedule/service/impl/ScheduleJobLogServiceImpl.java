package io.looyoo.sys.schedule.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import io.looyoo.common.common.utils.PageInfo;
import io.looyoo.sys.schedule.dao.ScheduleJobLogDao;
import io.looyoo.sys.schedule.entity.ScheduleJobLogEntity;
import io.looyoo.sys.schedule.service.ScheduleJobLogService;

@Service("scheduleJobLogService")
public class ScheduleJobLogServiceImpl extends ServiceImpl<ScheduleJobLogDao, ScheduleJobLogEntity>
		implements ScheduleJobLogService {
	@Autowired
	private ScheduleJobLogDao scheduleJobLogDao;

	@Override
	public ScheduleJobLogEntity queryObject(Long jobId) {
		return scheduleJobLogDao.selectById(jobId);
		// return scheduleJobLogDao.queryObject(jobId);
	}

	@Override
	public void queryList(PageInfo pageInfo) {
		Page<ScheduleJobLogEntity> page = new Page<ScheduleJobLogEntity>(pageInfo.getNowpage(), pageInfo.getSize());
	    pageInfo.setRows(scheduleJobLogDao.queryList(page, pageInfo.getCondition()));
	    pageInfo.setTotal(scheduleJobLogDao.queryTotal(pageInfo.getCondition()));
	}

	@Override
	public void save(ScheduleJobLogEntity log) {
		scheduleJobLogDao.insert(log);
	}



}
