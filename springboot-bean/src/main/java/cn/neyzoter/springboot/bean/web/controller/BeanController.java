package cn.neyzoter.springboot.bean.web.controller;

import cn.neyzoter.springboot.bean.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


/**
 * @apiNote http请求返回bookList
 *
 * Created by @Neyzoter on 19/9/7.
 */
@RestController
public class BeanController {
    @Autowired
    private BookService bookService;
    // url : http://localhost:[port]/springboot-bean/api/booklist
    @RequestMapping(value = "/springboot-bean/api/booklist",method = RequestMethod.GET)
    public String bookList(){
        return bookService.getBookList().toString();
    }
}
