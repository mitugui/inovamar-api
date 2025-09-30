package br.com.incubadoraifpr.inovamar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class InovamarApplication {
	@GetMapping("/")
	public String hello() {
		return "Hello, Inovamar!";
	}

	public static void main(String[] args) {
		SpringApplication.run(InovamarApplication.class, args);
	}
}
