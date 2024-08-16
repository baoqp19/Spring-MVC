package vn.hoidanit.laptopshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

//disable security
// include >< exclude
@SpringBootApplication(
	exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)

// @SpringBootApplication
public class LaptopshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaptopshopApplication.class, args);
	}

}
