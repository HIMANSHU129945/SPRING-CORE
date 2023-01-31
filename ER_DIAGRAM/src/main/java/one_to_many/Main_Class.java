package one_to_many;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Class {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("one_to_many/NewFile.xml");
		System.out.println(c1.getBean("college"));

	}

}
