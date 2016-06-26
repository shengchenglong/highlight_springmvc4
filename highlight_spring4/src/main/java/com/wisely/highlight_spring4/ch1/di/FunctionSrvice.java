package com.wisely.highlight_spring4.ch1.di;

import org.springframework.stereotype.Service;
/**
 * ¹¦ÄÜBean
 * @author shengchenglong
 *
 */
@Service
public class FunctionSrvice {
	public String sayHello(String word) {
		return "hello " + word;
	}
}
