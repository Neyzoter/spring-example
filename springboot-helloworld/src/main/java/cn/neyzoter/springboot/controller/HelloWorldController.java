package cn.neyzoter.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(value = "/springboot-helloworld/api/helloworld",method = RequestMethod.GET)
    public String helloWorld(){
        return "Hellow World!";
    }
}
