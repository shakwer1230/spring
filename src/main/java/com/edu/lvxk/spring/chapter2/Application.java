/**
 * @author
 * @date : 2018年5月2日 上午1:14:55
 */
package com.edu.lvxk.spring.chapter2;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shakwer
 *
 */

//引用ApplicationContext三种模式
//1.AutoWired --User
//2.实现ApplicationContextAware接口 --Book
//3.使用构造函数  ---Bank(局限Bean类只能有一个构造函数)
public class Application {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("com.edu.lvxk.spring.chapter2");
		System.out.println(context.getBean("user"));
		context.getBean(User.class).show();
		
		context.getBean(Book.class).show();
		context.getBean(Bank.class).show(); 
		context.getBean(Dog.class).show(); 
		context.close();
	}
}
