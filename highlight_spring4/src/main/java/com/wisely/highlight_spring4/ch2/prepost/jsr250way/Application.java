package com.wisely.highlight_spring4.ch2.prepost.jsr250way;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JSR250Config.class);
		
		JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
		
		context.close();
	}
}
