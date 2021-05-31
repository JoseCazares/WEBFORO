package com.dwa.foro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan ({"com.dwa.foro.controladores, com.dwa.foro.modelo, com.dwa.foro.servicios", "controller", "service"})
public class WebForoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebForoApplication.class, args);
	}

}
