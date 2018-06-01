package com.zwd.app.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zwd.app.demo.ClientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zwd
 * @date 2018/5/29 20:30
 * @Email stephen.zwd@gmail.com
 */
@RestController
public class HelloController {

    @Reference
    private ClientService clientService;
    @RequestMapping(value = "/hello")
    public String hello(String name) {
        clientService.printHello();
        return "zz";
    }
}
