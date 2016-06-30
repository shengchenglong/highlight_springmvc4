package com.wisely.highlight_spring4.ch3.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
/**
 * spring aware 的演示Bean
 * 实现获得Bean名称和资源加载的服务
 * @author shengchenglong
 *
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
	
	private String beanName;
	
	private ResourceLoader resourceLoader;
	
	public void outputResult() {
		System.out.println("bean的name： " + beanName);
		
		Resource resource = resourceLoader.getResource("classpath:com/wisely/highlight_spring4/ch3/aware/test.txt");
		
		try {
			System.out.println("resource的加载内容为： " + IOUtils.toString(resource.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	public void setBeanName(String name) {
		this.beanName = name;
	}
	
	
	
	
}
