/**
 * @author
 * @date : 2018年5月2日 下午1:53:56
 */
package com.edu.lvxk.spring.chapter3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shakwer
 *
 */
@Configuration
public class MyConfig {
	@Bean(initMethod="init")
	public User createUser() {
		return new User();
	}
//	public User createUser2() {
//		return new User();
//	}
}
