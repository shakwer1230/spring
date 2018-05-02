/**
 * @author
 * @date : 2018年5月1日 下午10:48:54
 */
package com.edu.lvxk.spring;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author shakwer
 *
 */
public class RunnableFactory implements FactoryBean</*Runnable*/Jeep> {

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.FactoryBean#getObject()
	 */
	@Override
	public /*Runnable*/Jeep getObject() throws Exception {
		// TODO Auto-generated method stub
//		return ()->{};
		return new Jeep();
	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.FactoryBean#getObjectType()
	 */
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
//		return Runnable.class ;
		return Jeep.class;
	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.FactoryBean#isSingleton()
	 */
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;//是否单列 true 单列 ;false 非单列 
	}

}
