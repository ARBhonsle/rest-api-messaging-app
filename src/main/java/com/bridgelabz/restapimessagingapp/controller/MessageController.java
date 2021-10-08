package com.bridgelabz.restapimessagingapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    // localhost:8080/hello
    @RequestMapping(value = {"/hello", "/hello/"}, method = RequestMethod.GET)
    public String showHello() {
        return "Hello from BridgeLabz!\n";
    }

    // localhost:8080/hello/query?name=Mark
    @RequestMapping(value = {"/hello/query"}, method = RequestMethod.GET)
    public String helloQuery(@RequestParam(value = "name") String name) {
        return "Hello " + name + " from BridgeLabz!\n";
    }
}
