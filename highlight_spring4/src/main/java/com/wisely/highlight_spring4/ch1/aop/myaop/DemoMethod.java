package com.wisely.highlight_spring4.ch1.aop.myaop;

import org.springframework.stereotype.Service;

@Service
public class DemoMethod {
	public void say(String word) {
		System.out.println(word);
	}
}
