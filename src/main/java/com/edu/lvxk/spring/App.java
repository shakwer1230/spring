package com.edu.lvxk.spring;

import javax.jws.soap.SOAPBinding.Use;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class,User.class,UserDao.class,UserService.class,UserController.class);
       System.out.println(context.getBean(MyBean.class));//通过类型获取bean类
//       System.out.println(context.getBean("createMyBean"));//通过名字（默认为配置中的方法名）获取bean类；在没有为bean配置名字是有作用
       System.out.println(context.getBean("myBeanName"));//通过配置中的配置名获取
       

//       System.out.println(context.getBean(Runnable.class));
       System.out.println(context.getBean(Jeep.class));
       System.out.println(context.getBean("createRunnableFactory"));
       
       //获取factory本身 两种方法
       System.out.println(context.getBean(RunnableFactory.class));
       System.out.println(context.getBean("&createRunnableFactory"));
     
       
       System.out.println(context.getBean(Car.class));
       System.out.println(context.getBean("createCarFactory"));
//       System.out.println(context.getBean("createCarFactory2"));
       
       //bean类加载和销毁方法
       System.out.println(context.getBean(Cat.class));
       System.out.println(context.getBean(Dog.class));
       System.out.println(context.getBean(Animal.class));
       
       //利用@Compoent注解装载类
//       System.out.println(context.getBean(User.class));
//       System.out.println(context.getBean(User.class));
       System.out.println(context.getBean("myUser"));
       System.out.println(context.getBean("bUser"));
       System.out.println(context.getBeansOfType(User.class));
      
       System.out.println(context.getBean(UserDao.class));
       System.out.println(context.getBean(UserService.class));
       System.out.println(context.getBean(UserController.class));
       context.close();
    }
}
