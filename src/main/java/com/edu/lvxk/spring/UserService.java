/**
 * @author
 * @date : 2018年5月2日 上午12:17:39
 */
package com.edu.lvxk.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author shakwer
 *
 */
//@Servie一般用在业务逻辑层
@Service
public class UserService {
	@Autowired
//	@Qualifier("createUserDao")
	private UserDao userDao;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [userDao=" + userDao + "]";
	}
}
