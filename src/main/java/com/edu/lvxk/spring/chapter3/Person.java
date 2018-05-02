/**
 * @author
 * @date : 2018年5月2日 下午2:21:57
 */
package com.edu.lvxk.spring.chapter3;

import org.springframework.stereotype.Component;

/**
 * @author shakwer
 *
 */
//@Component
public class Person {
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
