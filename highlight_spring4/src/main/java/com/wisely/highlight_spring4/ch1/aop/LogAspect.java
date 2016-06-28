package com.wisely.highlight_spring4.ch1.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect//声明一个切面
@Component
public class LogAspect {
	
	@Pointcut("@annotation(com.wisely.highlight_spring4.ch1.aop.Action)")//声明切点
	public void annotationPointCut() {
		
	}
	
	@After("annotationPointCut()")//申明建言
	public void after(JoinPoint joinPoint) {
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		
		Method method = methodSignature.getMethod();
		
		Action action = method.getAnnotation(Action.class);
		
		System.out.println("注解式拦截：  " + action.name());
	}
	
	@Before("execution(* com.wisely.highlight_spring4.ch1.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint) {
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		
		Method method = methodSignature.getMethod();
		
		System.out.println("方法规则式拦截：  " + method.getName());
	}
}
