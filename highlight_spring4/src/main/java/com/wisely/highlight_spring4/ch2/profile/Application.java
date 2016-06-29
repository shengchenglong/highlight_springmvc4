package com.wisely.highlight_spring4.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
//		context.getEnvironment().setActiveProfiles("test");//先将活动的profile设置成test
//		context.register(JavaConfig.class);//后置注册Bean配置类，不然Bean未定义
//		context.refresh();//刷新容器
//		
//		DemoBean bean = context.getBean(DemoBean.class);
//		
//		System.out.println(bean.getContent());
		
		
		context.getEnvironment().setActiveProfiles("dev");//先将活动的profile设置成test
		context.register(JavaConfig.class);//后置注册Bean配置类，不然Bean未定义
		context.refresh();//刷新容器
		
		DemoBean bean1 = context.getBean(DemoBean.class);
		
		System.out.println(bean1.getContent());
		
		context.close();
	}
	
}
