package io.looyoo.sys.config.service.impl;

import java.util.Arrays;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import io.looyoo.common.common.utils.PageInfo;
import io.looyoo.common.common.utils.RRException;
import io.looyoo.sys.config.dao.SysConfigDao;
import io.looyoo.sys.config.entity.SysConfigEntity;
import io.looyoo.sys.config.service.SysConfigService;
import io.looyoo.sys.oss.entity.SysOssEntity;

@Service("sysConfigService")
public class SysConfigServiceImpl   extends ServiceImpl<SysConfigDao, SysConfigEntity> implements SysConfigService {
	@Autowired
	private SysConfigDao sysConfigDao;
	
	@Override
	public void save(SysConfigEntity config) {
		sysConfigDao.insert(config);
	}

	@Override
	public void update(SysConfigEntity config) {
		sysConfigDao.updateById(config);
	}

	@Override
	public void updateValueByKey(String key, String value) {
		sysConfigDao.updateValueByKey(key, value);
	}

	@Override
	public void deleteBatch(Long[] ids) {
		sysConfigDao.deleteBatchIds(Arrays.asList(ids));
	}

	
	@Override
	public void queryList(PageInfo pageInfo) {
		Page<SysOssEntity> page = new Page<SysOssEntity>(pageInfo.getNowpage(), pageInfo.getSize());
	    pageInfo.setRows(sysConfigDao.queryList(page, pageInfo.getCondition()));
	    pageInfo.setTotal(sysConfigDao.queryTotal(pageInfo.getCondition()));
	}
	@Override
	public SysConfigEntity queryObject(Long id) {
		return sysConfigDao.selectById(id);
	}

	@Override
	public String getValue(String key, String defaultValue) {
		String value = sysConfigDao.queryByKey(key);
		if(StringUtils.isBlank(value)){
			return defaultValue;
		}
		return value;
	}
	
	@Override
	public <T> T getConfigObject(String key, Class<T> clazz) {
		String value = getValue(key, null);
		if(StringUtils.isNotBlank(value)){
			return JSON.parseObject(value, clazz);
		}

		try {
			return clazz.newInstance();
		} catch (Exception e) {
			throw new RRException("获取参数失败");
		}
	}
}
