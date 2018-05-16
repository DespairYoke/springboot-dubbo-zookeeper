package com.zwd.app;

import com.zwd.app.demo.ClientService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author zwd
 * @date 2018/5/16 09:45
 * @Email lovejavazwd@gmail.com
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        ConfigurableApplicationContext run=SpringApplication.run(Main.class,args);
        ClientService clientService = run.getBean(ClientService.class);
        clientService.printHello();
    }
}
