package com.alexanastasyev.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.alexanastasyev.spring.aop")
@PropertySource("classpath:myApp.properties")
@EnableAspectJAutoProxy
public class AopConfig {
}
