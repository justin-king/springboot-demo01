package com.xm.demo01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ThreadTest {

    private static final int threadNum = 5 ;

    @Test
    public void threat(){
        System.out.println(LocalDateTime.now());

        for (int i=0 ; i<threadNum ; i++){
             Thread thread = getThread();
            thread.start();
        }
        System.out.println(LocalDateTime.now());
    }

    @Test
    public void testTime(){
        System.out.println(LocalDateTime.now());
        for (int k=0;k<1000;k++){
            for (int j=0;j<10;j++){
                if (j == 9){
                    System.out.println("循环次数为："+k+"-----当前数字为："+j);
                }
            }
        }
        System.out.println(LocalDateTime.now());
    }

    private Thread getThread(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int k=0;k<1000;k++){
                    for (int j=0;j<10;j++){
                        if (j == 9){
                            System.out.println("循环次数为："+k+"-----当前数字为："+j);
                        }
                    }
                }
            }
        });
        return thread;
    }

}
