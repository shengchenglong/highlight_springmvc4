package com.wisely.highlight_spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
/**
 * 任务执行类
 * @author shengchenglong
 *
 */
@Service
//@Async这里表明该类下所有方法都是异步方法
public class AsyncTaskService {
	
	@Async//用该注解表明这个事异步方法，可以放在类级别
	public void method1(int i) {
		System.out.println("线程：" + Thread.currentThread().getName() + "---" + "method1: " + i);
	}
	
	public void method2(int i) {
		System.out.println("线程：" + Thread.currentThread().getName() + "---" + "method2: " + i);
	}
}

/**
 线程：ThreadPoolTaskExecutor-1---method1: 0
线程：main---method2: 0
线程：main---method2: 1
线程：ThreadPoolTaskExecutor-2---method1: 1
线程：main---method2: 2
线程：main---method2: 3
线程：main---method2: 4
线程：main---method2: 5
线程：main---method2: 6
线程：main---method2: 7
线程：main---method2: 8
线程：main---method2: 9
线程：ThreadPoolTaskExecutor-4---method1: 3 
线程：ThreadPoolTaskExecutor-4---method1: 5
线程：ThreadPoolTaskExecutor-4---method1: 6
线程：ThreadPoolTaskExecutor-4---method1: 7
线程：ThreadPoolTaskExecutor-4---method1: 8
线程：ThreadPoolTaskExecutor-4---method1: 9
线程：ThreadPoolTaskExecutor-3---method1: 2
线程：ThreadPoolTaskExecutor-5---method1: 4
 * 
 * 从上面可以看出，main线程一定是顺序执行的，
 * 而TaskExecutor的参数核心线程池容量是5 -->  taskExecutor.setCorePoolSize(5);
 * 所以总共会有5个线程去执行method1方法，
 * ！！！在该种情况下，method1方法被并发执行，并不是按顺序执行！！！
 * ！！！但是，若是同一个线程，必定是按顺序的 --> 37~42行！！！
 * 
 */
