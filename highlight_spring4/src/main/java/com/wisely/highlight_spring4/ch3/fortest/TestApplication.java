package com.wisely.highlight_spring4.ch3.fortest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//在junit环境中提供Spring TestContext Framework 的功能
@ContextConfiguration(classes = {TestConfig.class})//该注解用来加载配置ApplicationContext,其中的classes属性用来加载配置类
@ActiveProfiles("dev")//声明活动的profile
public class TestApplication {

	@Autowired
	private TestBean testBean;
	
	@Test
	public void test1() {
		String content = testBean.getContent();
		System.out.println(content);
	}
}
