package cn.neyzoter.springboot.mybatis.mysql.biz;

import cn.neyzoter.springboot.mybatis.mysql.dal.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Task jobs
 * @author Neyzoter Song
 * @data 19/9/16
 */
@Component("taskjobs")
public class Taskjobs {
    private final static Logger logger = LoggerFactory.getLogger(Taskjobs.class);
    /**
     * cannot use @Autowired (byType)
     */
    @Resource
    private UserMapper userMapper;
    /**
     * save user info periodically
     */
    @Scheduled(cron="10/5 * * * * ?")
    public void saveUser(){
        logger.info(userMapper.selectAll().toString());
    }
}
