package com.wisely.highlight_springmvc4;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
/**
 * 实现WebApplicationInitializer接口 用来代替web.xml,
 * 只要实现该接口，就会自动被SpringServletContainerInitializer获取到，用来启动Servlet容器
 * @author shengchenglong
 *
 */
public class WebInitializer implements WebApplicationInitializer {
	

	public void onStartup(ServletContext servletContext) throws ServletException {
			//新建WebApplicationContext,注册配置类，并将其和当前servletContext关联
			AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
			context.register(MyMvcConfig.class);
			context.setServletContext(servletContext);
			
			//注册新的Spring MVC 的dispatcher
			Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
			servlet.addMapping("/");
			servlet.setLoadOnStartup(1);
			
		
	}

}
