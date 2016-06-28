package com.wisely.highlight_spring4.ch1.aop.myaop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		DemoUseMethod demoUseMethod = context.getBean(DemoUseMethod.class);
		
		demoUseMethod.say("我是输入的内容");
	}
}
