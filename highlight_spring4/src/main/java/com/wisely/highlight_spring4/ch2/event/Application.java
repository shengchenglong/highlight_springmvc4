package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
		
		DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
		
		demoPublisher.publish("这是发布的信息！");
		
		context.close();
	}
}
