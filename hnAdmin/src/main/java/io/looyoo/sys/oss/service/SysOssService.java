package io.looyoo.sys.oss.service;

import com.baomidou.mybatisplus.service.IService;

import io.looyoo.common.common.utils.PageInfo;
import io.looyoo.sys.oss.entity.SysOssEntity;

/**
 * 文件上传
 * 
 * @author looyoo
 * @email service@gmail.com
 * @date 2017-03-25 12:13:26
 */
public interface SysOssService  extends IService<SysOssEntity>{
	
	SysOssEntity queryObject(Long id);
	
	void queryList(PageInfo pageInfo);
	
	void save(SysOssEntity sysOss);
	
	void update(SysOssEntity sysOss);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
