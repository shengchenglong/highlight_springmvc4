package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * 配置Bean，自动扫描该包下的所有相应注解类，并注册为Bean
 * @author shengchenglong
 *
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch1.di")
public class DiConfig {
	
}
