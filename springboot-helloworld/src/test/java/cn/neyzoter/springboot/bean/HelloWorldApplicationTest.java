package cn.neyzoter.springboot.bean;

import cn.neyzoter.springboot.bean.controller.HelloWorldController;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


/**
 *
 * Created by @Neyzoter on 19/9/7.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldApplicationTest {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldApplicationTest.class);
    @Before
    public void before(){
        logger.info("Before");
    }
    @Test
    public void HelloWorldControllerTest(){
        assertEquals("Hello World!",new HelloWorldController().helloWorld());
        logger.info("Test");
    }
    @After
    public void after(){
        logger.info("After");
    }
}
