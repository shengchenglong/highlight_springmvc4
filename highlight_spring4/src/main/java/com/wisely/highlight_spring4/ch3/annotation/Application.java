package com.wisely.highlight_spring4.ch3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WiselyConfiguration.class);
		
		DemoService demoService = context.getBean(DemoService.class);
		
		demoService.say();
		
		context.close();
	}
}
