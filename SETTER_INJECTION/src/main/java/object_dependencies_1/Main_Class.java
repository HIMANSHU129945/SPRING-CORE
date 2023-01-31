package object_dependencies_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Class {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c1= new ClassPathXmlApplicationContext("object_dependencies_1/NewFile.xml");
		System.out.println(c1.getBean("vehicle"));
	}

}
