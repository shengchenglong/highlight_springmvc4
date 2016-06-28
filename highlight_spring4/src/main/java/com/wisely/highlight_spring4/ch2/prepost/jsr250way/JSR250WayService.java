package com.wisely.highlight_spring4.ch2.prepost.jsr250way;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Service;

@Service
public class JSR250WayService {
	
	@PostConstruct//在构造函数之前执行
	public void init() {
		System.out.println("jsr250 init method");
	}
	
	@PreDestroy//在Bean销毁之前执行
	public void destroy() {
		System.out.println("jsr250 destroy method");
	}
	
	public JSR250WayService() {
		System.out.println("构造函数初始化");
	}
}
