package com.springboot.shizhan.ch03.demo01;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class MyApp {

	public static void main(String[] args) {
		log.info("starting");
		for(String arg : args){
			log.info(arg);
		}

		SpringApplication.run(MyApp.class, args);

	}

}
