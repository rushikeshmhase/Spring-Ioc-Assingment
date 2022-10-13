package com.yash.springioc.problem4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
	
		SetterMessage st=(SetterMessage) app.getBean("setmsg");
	
	st.display();
	
	}
}
