package com.xm.demo01.job;

import java.time.LocalDateTime;

/**
 * xml配置定时任务
 * @author xuman15
 */
public class XmlTask {
    public void task(){
        System.out.println("基于XML配置定时任务："+ LocalDateTime.now());
    }

}
