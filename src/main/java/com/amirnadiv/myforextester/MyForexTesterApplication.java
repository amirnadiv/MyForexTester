package com.amirnadiv.myforextester;

import com.amirnadiv.myforextester.configuration.MyForexTesterConfiguration;
import com.amirnadiv.myforextester.service.ForexDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class MyForexTesterApplication {


    @Autowired
    static ForexDataService forexDataService;

    public static void main(String[] args) throws IOException {
        SpringApplication.run(MyForexTesterApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(MyForexTesterConfiguration.class);
        ForexDataService forexDataService = context.getBean(ForexDataService.class);
        forexDataService.initDataAfterStartup();
    }



}
