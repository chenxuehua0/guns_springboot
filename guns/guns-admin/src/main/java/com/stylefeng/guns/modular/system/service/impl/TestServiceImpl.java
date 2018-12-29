package com.stylefeng.guns.modular.system.service.impl;

import com.stylefeng.guns.modular.system.model.Test;
import com.stylefeng.guns.modular.system.dao.TestMapper;
import com.stylefeng.guns.modular.system.service.ITestService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 测试表 服务实现类
 * </p>
 *
 * @author stylefeng
 * @since 2018-08-20
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
