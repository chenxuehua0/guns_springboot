package io.looyoo.api.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.looyoo.api.annotation.IgnoreAuth;
import io.looyoo.api.annotation.LoginUser;
import io.looyoo.api.entity.TbUserEntity;
import io.looyoo.common.common.utils.R;

/**
 * API测试接口
 *
 * @author looyoo
 * @email service@gmail.com
 * @date 2017-03-23 15:47
 */
@RestController
@RequestMapping("/api")
public class ApiTestController {

    /**
     * 获取用户信息
     */
    @GetMapping("userInfo")
    public R userInfo(@LoginUser TbUserEntity user){
        return R.ok().put("user", user);
    }

    /**
     * 忽略Token验证测试
     */
    @IgnoreAuth
    @GetMapping("notToken")
    public R notToken(){
        return R.ok().put("msg", "无需token也能访问。。。");
    }
}
