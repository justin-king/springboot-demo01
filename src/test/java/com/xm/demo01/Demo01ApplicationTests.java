package com.xm.demo01;

import com.xm.demo01.job.PrintWordsJob;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class Demo01ApplicationTests {

    private static final String cron = "*/3 * * * * ?";

    @Test
    public void contextLoads() {
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        try {
            Scheduler scheduler = schedulerFactory.getScheduler();
            //作业详情
            JobDetail jobDetail = getJobDetail();
            //触发器
            Trigger trigger = TriggerBuilder.newTrigger()
                                            .withIdentity("MyTrigger","group1")
                                            .startNow()
                                            .withSchedule(SimpleScheduleBuilder
                                                    .simpleSchedule()
                                                    .withIntervalInSeconds(5)
                                                    .repeatForever())
                                            .build();
            scheduler.scheduleJob(jobDetail,trigger);
            //启动定时任务
            scheduler.start();
            log.info("定时任务已启动");

            //线程睡眠1分钟
            TimeUnit.MINUTES.sleep(1);
            scheduler.shutdown();
            log.info("定时任务已停止！");

        } catch (SchedulerException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    
    @Test
    public void testSchedule() {
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        JobDetail jobDetail = getJobDetail();
        Trigger trigger = TriggerBuilder.newTrigger()
                                        .withIdentity("Trigger2","group2")
                                        .withSchedule(CronScheduleBuilder.cronSchedule(cron))
                                        .build();
        try {
            Scheduler scheduler = schedulerFactory.getScheduler();
            scheduler.scheduleJob(jobDetail,trigger);
            log.info("定时任务开启！");
            scheduler.start();

            TimeUnit.MINUTES.sleep(1);
            scheduler.shutdown();
            log.info("定时任务停止！");
        } catch (SchedulerException e) {
            throw new SecurityException("定时任务执行异常！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

        private final JobDetail getJobDetail(){
        JobDetail jobDetail = JobBuilder.newJob(PrintWordsJob.class)
                .withIdentity("MyJob","group1")
                .build();
        return jobDetail;
    }

}
