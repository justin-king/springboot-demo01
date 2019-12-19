package com.xm.demo01.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author xuman15
 */
@Component
public class ScheduleTask {

    @Scheduled(cron = "0/2 * * * * ?")
    public void scheduleTsk(){
        System.out.println("基于注解配置定时任务："+ LocalDateTime.now());
    }

}
