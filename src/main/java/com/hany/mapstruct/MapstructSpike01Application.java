package com.hany.mapstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import hany.modern.treasury.annotation.BenefeciaryRepository;

//@SpringBootApplication
@ComponentScan(basePackages = { "hany.modern.treasury.annotation", "com.hany.hibernate.bootstrap" })
@EnableAutoConfiguration
@SpringBootConfiguration
public class MapstructSpike01Application {

	public static void main(String[] args) {
		SpringApplication.run(MapstructSpike01Application.class, args);

		ACHWebClient achClient = new ACHWebClient();
//		achClient.consume();
	}

}
