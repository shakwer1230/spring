/**
 * @author
 * @date : 2018年5月2日 上午12:58:31
 */
package com.edu.lvxk.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shakwer
 *
 */
public class AnnotationClient {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.edu.lvxk.spring");

		// bean类加载和销毁方法
		System.out.println(context.getBean(Cat.class));
		System.out.println(context.getBean(Dog.class));
		System.out.println(context.getBean(Animal.class));
		context.close();
	}
}
