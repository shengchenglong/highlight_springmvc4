package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;
/**
 * 使用注解    的被拦截类
 * @author shengchenglong
 *
 */
@Service
public class DemoAnnotationService {
	
	@Action(name="注解式的add操作")
	public void add() {
		
	}
}
