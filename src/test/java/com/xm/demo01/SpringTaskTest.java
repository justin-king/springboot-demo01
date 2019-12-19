package com.xm.demo01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:spring-task.xml")
public class SpringTaskTest {

    private static int count ;

    @Test
    public void testOne(){
        System.out.println("定时任务：" + count++ );
        while (true){
            //死循环保证程序一直运行
        }
    }

}
