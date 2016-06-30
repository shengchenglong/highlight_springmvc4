package com.wisely.highlight_spring4.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
/**
 * 事件发布类
 * @author shengchenglong
 *
 */
@Component
public class DemoPublisher {
	
	//注入ApplicationContext
	@Autowired
	ApplicationContext applicationContext;
	
	public void publish(String msg) {
		//使用applicationcontext的publishEvent()方法来发事件
		applicationContext.publishEvent(new DemoEvent(this, msg));
	}
}
