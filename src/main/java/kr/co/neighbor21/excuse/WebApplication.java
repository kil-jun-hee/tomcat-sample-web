package kr.co.neighbor21.excuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class WebApplication {//메인 브랜치 커밋

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
}