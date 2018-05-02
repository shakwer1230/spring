/**
 * @author
 * @date : 2018年5月2日 上午1:14:36
 */
package com.edu.lvxk.spring.chapter2;

import java.applet.AppletContext;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author shakwer
 *
 */
@Component
public class User {
	
	private ApplicationContext applicationContext;
	
	/**
	 * @param applicationContext the applicationContext to set
	 */
	@Autowired
	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
		System.out.println("==========User.set============");
	}
	public void show() {
		System.out.println("user : "+this.applicationContext);
	}
	@PostConstruct
	public void init() {
		System.out.println("=======User.init=======");
	}
	
}
