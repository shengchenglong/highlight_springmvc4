package com.wisely.highlight_spring4.ch1.javaconfig;

/**
 * 使用功能Bean
 * @author shengchenglong
 *
 */
//此处没有申明Bean
public class UserFunctionService {
	//此处没有注入Bean
	FunctionServcie functionServcie;

	public FunctionServcie getFunctionServcie() {
		return functionServcie;
	}

	public void setFunctionServcie(FunctionServcie functionServcie) {
		this.functionServcie = functionServcie;
	}
	
	
}
