package cn.neyzoter.springboot.security.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller
 * @author Neyzoter Song
 * @date 2019/9/8
 */
@RestController
public class Controller {

    /**
     * login not safe with GET
     * @param nickname
     * @param psw
     * @return {@link String}
     */
    @RequestMapping(value = "/springboot-security/api/login-not-safe",method = RequestMethod.GET)
    public String loginNotSafe(@RequestParam("nickname") String nickname,
                        @RequestParam("psw") String psw){
        String loginName = "nick";
        String loginPsw = "123";
        if (nickname.equals(loginName) && psw.equals(loginPsw)){
            return "OK";
        }else{
            return "Error";
        }
    }
}
