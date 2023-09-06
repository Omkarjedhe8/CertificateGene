package com.renocrewsoluations.certgenerator;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.renocrewsoluations.certgenerator.entity") // Specify the package where your entity classes are located
@ComponentScan(basePackages = "com.renocrewsoluations.certgenerator.repository") // Specify the base package for component scanning
//@EnableJpaRepositories(basePackages = "com.renocrewsoluations.certgenerator.repository") // Enable JPA repositories
public class CertificateGenApplication {

	    public static void main(String[] args) {
	        SpringApplication.run(CertificateGenApplication.class, args);
	        System.out.println("Application started successfully.");
	    }

	}

