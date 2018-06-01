package com.zwd.app.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zwd.DemoService;
import org.springframework.stereotype.Component;

/**
 * @author zwd
 * @date 2018/5/16 09:46
 * @Email lovejavazwd@gmail.com
 */
@Component
public class ClientService {

    @Reference
    DemoService demoService;

    public void printHello() {
        String s= demoService.sayHello("zwd");
        System.out.println(s);
    }
}
