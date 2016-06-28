package com.wisely.highlight_spring4.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);
		
		ELConfig service = context.getBean(ELConfig.class);
		
		service.outputResource();
		
		context.close();
	}
}
