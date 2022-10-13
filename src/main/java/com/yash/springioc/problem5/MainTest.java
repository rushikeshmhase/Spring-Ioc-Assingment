package com.yash.springioc.problem5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee fd=(Employee) app.getBean("c");
		Employee fd1=(Employee) app.getBean("m");
		Employee fd2=(Employee) app.getBean("s");
	fd.display();
	fd1.display();
	fd2.display();
	
	}
}
