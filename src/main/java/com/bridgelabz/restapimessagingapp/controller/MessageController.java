package com.bridgelabz.restapimessagingapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    // localhost:8080/hello
    @RequestMapping(value = {"/hello","/hello/"},method = RequestMethod.GET)
    public String showHello(){
        return "Hello from BridgeLabz! \n";
    }

}
