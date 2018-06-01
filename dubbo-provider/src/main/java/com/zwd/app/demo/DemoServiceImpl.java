package com.zwd.app.demo;


import com.alibaba.dubbo.config.annotation.Service;
import com.zwd.DemoService;

import javax.annotation.PostConstruct;

/**
 * @author zwd
 * @date 2018/5/16 09:19
 * @Email lovejavazwd@gmail.com
 */
@Service
public class DemoServiceImpl implements DemoService {

    @PostConstruct
    void init () {
        System.out.println("kk");
    }
    @Override
    public String sayHello(String name) {
        return "Hello" + name;
    }
}
