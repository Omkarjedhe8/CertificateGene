package com.renocrewsoluations.certgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.renocrewsoluations.cretigenerator.CertificateGenApplication" }) 
public class CertificateGenApplication {

	public static void main(String[] args) {
		SpringApplication.run(CertificateGenApplication.class, args);
	System.out.println("success");
	
	}

}
