package com.dko.springTutosCode;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

import com.dko.beans.AppConfig;
import com.dko.beans.Mundo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

public class App {

	public static void main(String[] args) {
		
		//#funciones por medio de anotaciones 
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Mundo m = (Mundo) appContext.getBean("mundo");
		System.out.println(m.getSaludo());
		((ConfigurableApplicationContext)appContext).close();
		
		
		
		//###Funcionando por medio de xml
		
//		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/dko/xml/beans.xml");
//		Mundo m = (Mundo) appContext.getBean("mundo");
//		System.out.println(m.getSaludo());
//		((ConfigurableApplicationContext)appContext).close();
	}
	
	

}
