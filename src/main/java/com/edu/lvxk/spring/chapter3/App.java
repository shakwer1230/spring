/**
 * @author
 * @date : 2018年5月2日 下午1:50:51
 */
package com.edu.lvxk.spring.chapter3;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shakwer
 * bean的動態注入
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("com.edu.lvxk.spring.chapter3");
		
		//1.通過BeanDefinitionRegistryPostProcessor 接口的BeanDefinitionRegistry 對象動態注入
	    context.getBeansOfType(Person.class).values().forEach(System.out::println);
	    
	    //2.手動在contex中注入
	    BeanDefinition beanDefinition=null;
	    context.registerBeanDefinition("person"+11, beanDefinition);
		context.close();
	}
}
