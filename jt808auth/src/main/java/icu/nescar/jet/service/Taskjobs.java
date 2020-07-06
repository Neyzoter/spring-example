package icu.nescar.jet.service;

import icu.nescar.jet.service.impl.ClientServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Task jobs
 * @author Neyzoter Song
 * @data 19/9/16
 */
@Component("taskjobs")
public class Taskjobs {
    private final static Logger logger = LoggerFactory.getLogger(Taskjobs.class);
    @Autowired
    ClientServiceImpl clientService;
    /**
     * save user info periodically
     */
    @Scheduled(cron="10/5 * * * * ?")
    public void saveUser(){
        logger.info(clientService.existClient("client1", "123456")? "Existed" : "Not Existed");
    }
}
