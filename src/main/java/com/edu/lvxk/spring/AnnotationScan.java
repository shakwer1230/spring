/**
 * @author
 * @date : 2018年5月2日 上午1:07:09
 */
package com.edu.lvxk.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author shakwer
 *
 */
@ComponentScan(basePackages="com.edu.lvxk.spring",excludeFilters=@Filter(type=FilterType.ASSIGNABLE_TYPE,classes= {UserController.class}))
@Configuration
public class AnnotationScan {

}
