package com.wisely.highlight_spring4.ch2.prepost.beanway;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
		
		BeanWayService beanWayService = context.getBean(BeanWayService.class);
		
		context.close();
	}
}
