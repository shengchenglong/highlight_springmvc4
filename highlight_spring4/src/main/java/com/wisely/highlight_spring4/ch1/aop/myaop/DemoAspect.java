package com.wisely.highlight_spring4.ch1.aop.myaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoAspect {
	
	/**
	 *  这里的com.wisely.highlight_spring4.ch1.aop.myaop.*.*(..)会拦截该包下的所有的方法（造成通知会被调用多次）
	 */
	@Pointcut("execution(* com.wisely.highlight_spring4.ch1.aop.myaop.DemoMethod.say(..))")
	public void annotationPointCut() {
		
	}
	
	@Before("annotationPointCut()")
	public void befor() {
		System.out.println("在之前调用---");
	}
	
	@After("annotationPointCut()")
	public void after() {
		System.out.println("在之后调用---");
	}
	
	
}
