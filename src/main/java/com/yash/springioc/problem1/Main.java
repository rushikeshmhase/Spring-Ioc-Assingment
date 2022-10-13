package com.yash.springioc.problem1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Create three bean classes, Movie, CinemaHall, and City. Different cities will have
//cinemahall with same name, and different cinemahall play same movies now you have
//to inject beans on the basis of requirements and you have to show the list of cinema hall
//playing movies in a particular city .


public class Main {

	public static void main(String[] args) {

		ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		City objSCBean =(City) objAC.getBean("city");
		City objSCBean1 =(City) objAC.getBean("city1");
		City objSCBean2 =(City) objAC.getBean("city2");
		City objSCBean3 =(City) objAC.getBean("city3");
		objSCBean.show();	
		objSCBean1.show();		
		objSCBean2.show();
		objSCBean3.show();
		
	}
}
