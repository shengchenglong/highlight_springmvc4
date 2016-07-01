package com.wisely.highlight_spring4.ch3.annotation;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public void say() {
		System.out.println("annotation ");
	}
}
