package com.bridgelabz.restapimessagingapp.controller;

import com.bridgelabz.restapimessagingapp.entity.UserDetails;
import org.springframework.web.bind.annotation.*;

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

//     localhost:8080/hello/param/Mark
    @GetMapping(value = {"/hello/param/{name}"})
    public String helloPathParam(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz!\n";
    }

//    localhost:8080/hello/post
//    Request Body: JSON
//    {
//        "fname" : "Mark",
//            "lname" : "Taylor"
//    }
    @RequestMapping(value = {"/hello/post"}, method = RequestMethod.POST)
    public String helloPost(@RequestBody UserDetails user) {
        return user.details();
    }

}
