/**
 * @author
 * @date : 2018年5月2日 上午2:27:33
 */
package com.edu.lvxk.spring.chapter2;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author shakwer
 *
 */
@Component
public class Dog  implements SpringContextAware{
	private ApplicationContext applicationContext;
	/* (non-Javadoc)
	 * @see com.edu.lvxk.spring.chapter2.SpringContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) {
		// TODO Auto-generated method stub
		this.applicationContext=applicationContext;
	}
	public void show() {
		System.out.println("dog : "+this.applicationContext);
	}

}
