package com.renocrewsoluations.certgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication
@ComponentScan(basePackages = {"com.renocrewsoluations.cretigenerator.CertificateGenApplication" }) 
@EntityScan(" com.renocrewsoluations.certgenerator.repository")
@EnableJpaRepositories("com.renocrewsoluations.certgenerator.repository.CertificationRepository")
@SpringBootApplication
public class CertificateGenApplication {

	public static void main(String[] args) {
		SpringApplication.run(CertificateGenApplication.class, args);
	System.out.println("success");
	
	}

}
