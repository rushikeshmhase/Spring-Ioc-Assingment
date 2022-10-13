package com.yash.springioc.problem3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		
	ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	ConstructorMessage con=(ConstructorMessage)app.getBean("conmege");
	con.display();
	}
}
