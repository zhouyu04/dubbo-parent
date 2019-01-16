package com.zzyy.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zzyy.entity.User;
import com.zzyy.service.UserService;

/**
 * @Auther: zhouyu
 * @Date: 2019/1/16 10:09
 * @Description:
 */

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User saveUser(User user) {
        return null;
    }
}
