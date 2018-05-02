/**
 * @author
 * @date : 2018年5月1日 下午11:33:48
 */
package com.edu.lvxk.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author shakwer
 *
 */
public class Cat implements InitializingBean,DisposableBean {

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.DisposableBean#destroy()
	 */
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("=====Cat.destroy======");
		
	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("=====Cat.afterPropertiesSet=====");
	}

}
