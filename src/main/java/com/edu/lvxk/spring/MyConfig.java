/**
 * @author
 * @date : 2018年5月1日 下午10:30:50
 */
package com.edu.lvxk.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

/**
 * @author shakwer
 * Bean的装配两种模式
 */
@Configuration 
public class MyConfig {
	//直接配置
	@Bean(name="myBeanName")
	@Scope("prototype")//bean默认为单列 添加Scope("prototype")非单列模式
	public MyBean createMyBean() {
		return new MyBean();
	}
	
	//通过工厂的模式
	@Bean
	public RunnableFactory createRunnableFactory() {
		return new RunnableFactory();
	}
	
	 //工厂的另一种模式
	 @Bean
     public CarFactory createCarFactory() {
  	   return new CarFactory();
     }
	 
	 @Bean
	 public Car createCar(CarFactory factory) {
		 return factory.create();
	 }
	 
//	 @Bean
//	 public Car createCar2() {
//		 return new CarFactory().create();
//	 }
	
	 //bean类加载和销毁方法(三种方法)
	 
	 //1.实现InitializingBean,DisposableBean 两个接口的方法afterPropertiesSet、destroy 
	 @Bean
	 public Cat createCat() {
		 return new Cat();
	 }
	 
	 //2、利用bean的initMethod和destroyMethod 指定类中方法
	 @Bean(initMethod="init",destroyMethod="destory")
	 public Dog createDog() {
		 return new Dog();
	 }
	 
	 //利用@PostConstruct 、@PreDestroy 注解
	 @Bean
	 public Animal createAnimal() {
		 return new Animal();
	 }
	 
	 @Bean(name="bUser")
	 public User createUser() {
		 return new User();
	 }
	 
	 
	 @Bean
	 @Primary//优先装配注解
	 public UserDao createUserDao() {
		 return new UserDao();
	 }
}
