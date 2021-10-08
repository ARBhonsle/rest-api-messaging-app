package com.bridgelabz.restapimessagingapp.controller;

import com.bridgelabz.restapimessagingapp.entity.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class MessageController {

    //         localhost:8080/hello
    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String showHello() {
        return "Hello from BridgeLabz!\n";
    }

    //         localhost:8080/hello/query?name=Mark
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String helloQuery(@RequestParam(value = "name") String name) {
        return "Hello " + name + " from BridgeLabz!\n";
    }

    //         localhost:8080/hello/param/Mark
    @GetMapping(value = {"/param/{name}"})
    public String helloPathParam(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz!\n";
    }

    //        localhost:8080/hello/post
//    Request Body: JSON
//    {
//        "fname" : "Mark",
//            "lname" : "Taylor"
//    }
    @RequestMapping(value = {"/post"}, method = RequestMethod.POST)
    public String helloPost(@RequestBody UserDetails user) {
        return user.details();
    }

    //    localhost:8080/hello/put/Mark?lname=Taylor
    @PutMapping("/put/{fname}")
    public String helloPut(@PathVariable String fname, @RequestParam(value = "lname") String lname) {
        return "Hello " + fname + " " + lname + " from BridgeLabz!\n";
    }

}
