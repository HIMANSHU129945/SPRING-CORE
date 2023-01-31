package object_dependencies;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Class {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c1=new  ClassPathXmlApplicationContext("object_dependencies/NewFile.xml");
		System.out.println(c1.getBean("person_1"));
	}

}
