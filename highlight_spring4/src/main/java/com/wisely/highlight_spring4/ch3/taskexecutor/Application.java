package com.wisely.highlight_spring4.ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		
		AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
		
		for(int i = 0; i < 10; i ++) {
			asyncTaskService.method1(i);
			asyncTaskService.method2(i);
		}
		
		context.close();
	}
}
