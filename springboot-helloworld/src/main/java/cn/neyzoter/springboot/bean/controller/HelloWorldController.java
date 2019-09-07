package cn.neyzoter.springboot.bean.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @apiNote http请求返回hello world
 *
 * Created by @Neyzoter on 19/9/6.
 */
@RestController
public class HelloWorldController {
    // url : http://localhost:[port]/springboot-helloworld/api/helloworld
    @RequestMapping(value = "/springboot-helloworld/api/helloworld",method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello World!";
    }
}
