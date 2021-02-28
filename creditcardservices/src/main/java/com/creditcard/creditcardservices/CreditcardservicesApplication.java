package com.creditcard.creditcardservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CreditcardservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditcardservicesApplication.class, args);
	}

}
