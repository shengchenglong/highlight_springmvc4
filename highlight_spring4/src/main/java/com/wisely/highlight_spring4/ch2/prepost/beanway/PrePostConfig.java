package com.wisely.highlight_spring4.ch2.prepost.beanway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch2.prepost.beanway")
public class PrePostConfig {
	
	@Bean(initMethod="init", destroyMethod="destroy")
	public BeanWayService beanWayService() {
		return new BeanWayService();
	}
	
}
