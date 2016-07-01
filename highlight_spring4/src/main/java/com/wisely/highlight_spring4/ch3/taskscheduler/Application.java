package com.wisely.highlight_spring4.ch3.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduleConfig.class);
		
		//ScheduledTaskService taskService = context.getBean(ScheduledTaskService.class);
		
		
	}
}	
