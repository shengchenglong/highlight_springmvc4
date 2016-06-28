package com.wisely.highlight_spring4.ch1.aop.myaop;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
@Service
public class DemoUseMethod {
	
	@Resource
	private DemoMethod demoMethod;
	
	public void say(String word) {
		demoMethod.say(word);
	}
	
}
