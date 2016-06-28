package com.wisely.highlight_spring4.ch1.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 拦截规则的注解（注解本身没有功能，就和xml一样，是一种元数据-->解释数据的数据，这就是配置）
 * （注解的功能来自于用这个注解的地方）
 * 自定义注解
 * @author shengchenglong
 *
 */
@Target(ElementType.METHOD)//指示在该注释类型下，程序元素的种类
@Retention(RetentionPolicy.RUNTIME)//指示注释类型的注释要保留多久
@Documented//指示某一类型的注释将通过 javadoc 和类似的默认工具进行文档化
public @interface Action {
	String name();
}
