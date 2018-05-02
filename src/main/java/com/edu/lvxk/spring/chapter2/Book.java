/**
 * @author
 * @date : 2018年5月2日 上午1:26:00
 */
package com.edu.lvxk.spring.chapter2;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author shakwer
 *
 */
@Component
public class Book implements ApplicationContextAware {
	private ApplicationContext applicationContext;
	/* (non-Javadoc)
	 * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext=applicationContext;
	}
	public void show() {
		System.out.println("book : "+this.applicationContext);
	}
}
