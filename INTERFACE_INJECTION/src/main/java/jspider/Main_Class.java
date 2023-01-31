package jspider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Class {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("jspider/NewFile.xml");
		Customer c=(Customer)c1.getBean("customer");
		System.out.println(c);
		
		Account a1=c.getAccounnt();
		a1.withdraw();
		a1.deposit();
		
	}

}
	