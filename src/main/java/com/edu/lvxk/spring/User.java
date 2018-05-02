/**
 * @author
 * @date : 2018年5月1日 下午11:58:39
 */
package com.edu.lvxk.spring;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author shakwer
 *
 */
//@Component 一般用在角色不明确的时候
@Component("myUser")
public class User {
	//spring注解
	@Autowired
	private UserService userService;

	//JSR-250注解(自带)
	@Resource
	private Dog dog;
	
	//JSR-330注解(需要依赖包 )
	@Inject
	private Cat cat;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [userService=" + userService + ", dog=" + dog + ", cat=" + cat + "]";
	}
	
	
	
}
