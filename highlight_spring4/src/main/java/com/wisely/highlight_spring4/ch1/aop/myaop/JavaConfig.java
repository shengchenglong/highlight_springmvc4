package com.wisely.highlight_spring4.ch1.aop.myaop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.wisely.highlight_spring4.ch1.aop.myaop")
@EnableAspectJAutoProxy
@Configuration
public class JavaConfig {

}
