/**
 * @author
 * @date : 2018年5月1日 下午11:49:31
 */
package com.edu.lvxk.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author shakwer
 *
 */
public class Animal {
	@PostConstruct
	public void init() {
		System.out.println("====Animal.init======");
	}
	@PreDestroy
	public void destory() {
		System.out.println("=====Animal.destory======");
	}
}
