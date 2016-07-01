package com.wisely.highlight_spring4.ch3.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
/**
 * 功能Bean
 * 任务执行类
 * @author shengchenglong
 *
 */
@Service
public class ScheduledTaskService {

	private static final SimpleDateFormat SDF = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)
	public void method1() {
		System.out.println(Thread.currentThread().getName() + " --- 每隔5秒执行一次：" + SDF.format(new Date()));
	}
	
	@Scheduled(cron = "0 10 11 ? * *")
	public void method2() {
		System.out.println(Thread.currentThread().getName() + " --- 在指定时间： " + SDF.format(new Date()));
	}
	
/**
 * CRON表达式    含义 
"0 0 12 * * ?"    每天中午十二点触发 
"0 15 10 ? * *"    每天早上10：15触发 
"0 15 10 * * ?"    每天早上10：15触发 
"0 15 10 * * ? *"    每天早上10：15触发 
"0 15 10 * * ? 2005"    2005年的每天早上10：15触发 
"0 * 14 * * ?"    每天从下午2点开始到2点59分每分钟一次触发 
"0 0/5 14 * * ?"    每天从下午2点开始到2：55分结束每5分钟一次触发 
"0 0/5 14,18 * * ?"    每天的下午2点至2：55和6点至6点55分两个时间段内每5分钟一次触发 
"0 0-5 14 * * ?"    每天14:00至14:05每分钟一次触发 
"0 10,44 14 ? 3 WED"    三月的每周三的14：10和14：44触发 
"0 15 10 ? * MON-FRI"    每个周一、周二、周三、周四、周五的10：15触发 
 * 
 * 
 * 
 * 
 * 
 * 执行结果：
pool-1-thread-1 --- 每隔5秒执行一次：11:09:46
pool-1-thread-1 --- 每隔5秒执行一次：11:09:51
pool-1-thread-1 --- 每隔5秒执行一次：11:09:56
pool-1-thread-1 --- 在指定时间： 11:10:00
pool-1-thread-1 --- 每隔5秒执行一次：11:10:01
pool-1-thread-1 --- 每隔5秒执行一次：11:10:06
pool-1-thread-1 --- 每隔5秒执行一次：11:10:11
 */
}
