package com.wisely.highlight_spring4.ch1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		UserFunctionService userFunctionService = context.getBean(UserFunctionService.class);
		
		String word = userFunctionService.functionServcie.sayHello("hello");
		
		System.out.println(word);
		
		context.close();
	}
}
