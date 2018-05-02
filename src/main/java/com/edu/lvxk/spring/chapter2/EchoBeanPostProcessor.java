/**
 * @author
 * @date : 2018年5月2日 上午1:42:52
 */
package com.edu.lvxk.spring.chapter2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author shakwer
 *容器内每个bean初始化都会调用异常
 *不能放null 否则 容器获取不到相应的bean
 *这里可以执行bean的一些处理，比如说 返回对象的代理对象
 */
@Component
public class EchoBeanPostProcessor implements BeanPostProcessor {

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessAfterInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	//在Bean 的init方法执行完之后才触发

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("====postProcessAfterInitialization======"+arg0.getClass());
		if(arg0 instanceof User) {
			return new LogUser();
		}
		return arg0;
	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessBeforeInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	//在Bean依赖配置（属性设置）完成之后触发
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("====postProcessBeforeInitialization======"+arg0.getClass());
		return arg0;
	}

}
