package ru.eastwind.whoisacat.springbootjmxTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringbootjmxTestApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(SpringbootjmxTestApplication.class, args);
		Thread.sleep(Long.MAX_VALUE);
	}
}
