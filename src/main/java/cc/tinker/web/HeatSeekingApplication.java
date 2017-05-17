package cc.tinker.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class HeatSeekingApplication {
	public static void main(String[] args) {
		SpringApplication.run(HeatSeekingApplication.class, args);
	}
}
