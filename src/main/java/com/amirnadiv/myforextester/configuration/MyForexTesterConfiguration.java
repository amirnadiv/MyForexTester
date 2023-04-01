package com.amirnadiv.myforextester.configuration;


import com.amirnadiv.myforextester.service.ForexDataService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyForexTesterConfiguration {


        @Bean
        ForexDataService forexDataService() {
            return new ForexDataService();
        }
    }


