package ru.eastwind.whoisacat.springbootjmxTest.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

//@Component
public class SimpleShceduler {

//    @Scheduled(cron = "0 */2 * * * *")
    public void run(){
        System.out.println(new Date());
    }
}
