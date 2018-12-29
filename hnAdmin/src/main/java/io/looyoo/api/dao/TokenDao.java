package io.looyoo.api.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import io.looyoo.api.entity.TbTokenEntity;

/**
 * 用户Token
 * 
 * @author looyoo
 * @email service@gmail.com
 * @date 2017-03-23 15:22:07
 */
public interface TokenDao  extends BaseMapper<TbTokenEntity> {
    
    TbTokenEntity queryByUserId(Long userId);

    TbTokenEntity queryByToken(String token);
	
}
