/**
 * @author
 * @date : 2018年5月2日 上午2:29:50
 */
package com.edu.lvxk.spring.chapter2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author shakwer
 *
 */
@Component
public class ContextBeanPostProcessor implements BeanPostProcessor {
	@Autowired
	private ApplicationContext applicationContext;
	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessAfterInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		if(arg0 instanceof SpringContextAware) {
			SpringContextAware sca=(SpringContextAware)arg0;
			sca.setApplicationContext(this.applicationContext);
		}
		return arg0;
	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessBeforeInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		return arg0;
	}

}
