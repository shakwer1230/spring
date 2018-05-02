/**
 * @author
 * @date : 2018年5月2日 下午1:56:03
 */
package com.edu.lvxk.spring.chapter3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * BeanFactoryPostProcessor 在spring容器初始化之后触发，而且只会触发一次
 * 觸發時間比BeanPostProcessor早
 * @author shakwer
 *
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		System.out.println("====MyBeanFactoryPostProcessor====="+arg0.getBeanDefinitionCount());
		
	}

}
