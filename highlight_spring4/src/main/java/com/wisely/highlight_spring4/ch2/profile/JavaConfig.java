package com.wisely.highlight_spring4.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
/**
 * Profile≈‰÷√
 * @author shengchenglong
 *
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch2.profile")
public class JavaConfig {
	
	@Bean
	@Profile("dev")
	public DemoBean devDemoBean() {
		return new DemoBean("dev profile");
	}
	
	@Bean
	@Profile("test")
	public DemoBean testDemobean() {
		return new DemoBean("test profile");
	}
}
