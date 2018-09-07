package com.test.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.test")
@EntityScan(basePackages="com.test")
public class SpringBootMain  {

	public static void main(String args[]) {
		SpringApplication.run(SpringBootMain.class,args);
		
	}
	
	/*@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		System.out.println("registry.."+registry);
		registry.addViewController("/").setViewName("welcome");
	}*/
		 
}
