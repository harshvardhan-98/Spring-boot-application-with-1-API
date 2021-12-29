package com.knoldus.kup.controller;

import com.knoldus.kup.services.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

//    injecting AppService object
    @Autowired
    AppService appService;

//    mapping request to this method
    @RequestMapping("/status")
    public String getStatusWithTime(){

//        we are using AppService class here that we have created
        return appService.getStatusWithTime();
    }

}
