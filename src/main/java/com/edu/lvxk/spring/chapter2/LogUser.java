/**
 * @author
 * @date : 2018年5月2日 上午1:59:47
 */
package com.edu.lvxk.spring.chapter2;

import org.springframework.stereotype.Component;

/**
 * @author shakwer
 *
 */

public class LogUser extends User {
//	public LogUser(User user) {
//	}
	public void show() {
		System.out.println("log user start ...");
		super.show();
		System.out.println("log user end ...");
	}
	
}
