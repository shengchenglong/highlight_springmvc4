package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听器
 * ApplicationListener<E extends ApplicationEvent>
 * 一个由应用事件监听器去实现的接口
 * parameter：E 一个继承了ApplicationEvent的类
 * @author shengchenglong
 *
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	/**
	 * 重写onApplicationEvent(E event)方法，对消息进行接受处理
	 */
	public void onApplicationEvent(DemoEvent event) {
		
		String message = event.getMsg();
		
		System.out.println("Bean-DemoListener 接收到了Bean-DemoEvent发布的信息：" + message);
	}

}
