/**
 * @author
 * @date : 2018年5月2日 下午2:21:24
 */
package com.edu.lvxk.spring.chapter3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * BeanDefinitionRegistryPostProcessor 可以拿到BeanDefinitionRegistry，ConfigurableListableBeanFactory兩個對象
 * BeanDefinitionRegistry 對象可以動態的注入bean對象
 *  * @author shakwer
 *
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor{

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanFactoryPostProcessor#postProcessBeanFactory(org.springframework.beans.factory.config.ConfigurableListableBeanFactory)
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor#postProcessBeanDefinitionRegistry(org.springframework.beans.factory.support.BeanDefinitionRegistry)
	 */
	//動態注入bean
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			BeanDefinitionBuilder bdb=BeanDefinitionBuilder.rootBeanDefinition(Person.class);
			bdb.addPropertyValue("name", "admin"+i);
			registry.registerBeanDefinition("peroson"+i, bdb.getBeanDefinition());
		}
	}

}
