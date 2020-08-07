package cn.neyzoter.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task implements Runnable {
    @Autowired
    Lib lib;
    @Override
    @Scheduled(cron="5/5 * * * * ?")
    public void run() {
        lib.service();
    }
}
