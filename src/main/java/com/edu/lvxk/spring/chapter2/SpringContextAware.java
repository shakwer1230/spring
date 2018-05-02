/**
 * @author
 * @date : 2018年5月2日 上午2:25:27
 */
package com.edu.lvxk.spring.chapter2;

import org.springframework.context.ApplicationContext;

/**
 * @author shakwer
 *
 */
public interface SpringContextAware {
	public void setApplicationContext(ApplicationContext applicationContext);
}
