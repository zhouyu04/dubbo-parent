package com.zzyy.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zzyy.service.UserService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zhouyu
 * @Date: 2019/1/16 10:20
 * @Description:
 */

@RestController
public class DemoController {

    @Reference
    private UserService userService;
}
