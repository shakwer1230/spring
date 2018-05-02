/**
 * @author
 * @date : 2018年5月2日 上午1:06:35
 */
package com.edu.lvxk.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shakwer
 *
 */
public class AnnotationClient2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationScan.class);
		   
	       //bean类加载和销毁方法
	       System.out.println(context.getBean(Cat.class));
	       System.out.println(context.getBean(Dog.class));
	       System.out.println(context.getBean(Animal.class));
	       System.out.println(context.getBean(UserController.class));// No qualifying bean of type [com.edu.lvxk.spring.UserController] is defined
	       context.close();
	}
}
