package com.wisely.highlight_spring4.ch3.taskexecutor;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
/**
 * 配置类
 * 实现AsyncConfigurer并重写getAsyncExecutor方法，返回一个ThreadPoolTaskExecutor
 * 获得一个基于线程池TaskExecutor
 * @author shengchenglong
 *
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch3.taskexecutor")
@EnableAsync//开启异步任务支持
public class TaskExecutorConfig implements AsyncConfigurer {

	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(5);
		taskExecutor.setMaxPoolSize(10);
		taskExecutor.setQueueCapacity(25);
		taskExecutor.initialize();
		return taskExecutor;
	}

	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		
		return null;
	}

}
