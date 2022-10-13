package com.yash.springioc.problem5;

public class FactoryDisplay {

	public static Employee getClerk() {
		return new Clerk();
	}
	
	public static Employee getManager() {
		return new Manager();
	}
	
	public static Employee  getSupervisor() {
		return new Supervisor();
	}
}
