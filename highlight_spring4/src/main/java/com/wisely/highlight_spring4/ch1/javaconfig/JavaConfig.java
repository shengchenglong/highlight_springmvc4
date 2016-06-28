package com.wisely.highlight_spring4.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//申明配置类，没有使用包扫描，因为所有的Bean在下面定义了
public class JavaConfig {
	
	@Bean
	public FunctionServcie functionServcie() {
		return new FunctionServcie();
	}
	
	//容器中存在这个FunctionService 的Bean，就可以
//	public UserFunctionService userFunctionService(FunctionServcie functionServcie) {
//		UserFunctionService userFunctionService = new UserFunctionService();
//		userFunctionService.setFunctionServcie(functionServcie);
//		return userFunctionService;
//	}
	
	@Bean
	public UserFunctionService userFunctionService() {
		UserFunctionService userFunctionService = new UserFunctionService();
		userFunctionService.setFunctionServcie(functionServcie());
		return userFunctionService;
	}
}
