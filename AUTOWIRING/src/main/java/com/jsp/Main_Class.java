package com.jsp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Class {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/jsp/NewFile.xml");
		Employee e1=c1.getBean("emp1",Employee.class);
		System.out.println(e1);
	}

}
