package com.wisely.highlight_spring4.ch2.prepost.beanway;

public class BeanWayService {
	public void init() {
		System.out.println("init method");
	}
	
	public void destroy() {
		System.out.println("destroy method");
	}
	
	public BeanWayService() {
		super();
		System.out.println("构造函数初始化。。");
	}
}
