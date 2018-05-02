/**
 * @author
 * @date : 2018年5月2日 上午1:31:03
 */
package com.edu.lvxk.spring.chapter2;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author shakwer
 *spring 4.3新态性
 */
@Component
public class Bank {
	private ApplicationContext applicationContext;
	public Bank(ApplicationContext applicationContext) {
		this.applicationContext=applicationContext;
	}
	public void show() {
		System.out.println("book : "+this.applicationContext);
	}
}
