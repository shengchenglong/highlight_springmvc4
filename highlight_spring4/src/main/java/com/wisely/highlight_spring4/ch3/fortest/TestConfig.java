package com.wisely.highlight_spring4.ch3.fortest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
/**
 * ≈‰÷√¿‡
 * @author shengchenglong
 *
 */
@Configuration
public class TestConfig {
	
	@Bean
	@Profile("dev")
	public TestBean devTestBean() {
		return new TestBean("devTestBean");
	}
	
	@Bean
	@Profile("prod")
	public TestBean prodTestBean() {
		return new TestBean("prodTestBean");
	}

}
