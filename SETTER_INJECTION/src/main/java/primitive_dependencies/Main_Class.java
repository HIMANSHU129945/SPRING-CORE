package primitive_dependencies;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Class {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("primitive_dependencies/NewFile.xml");
		System.out.println(c1.getBean("first_object"));
		System.out.println(c1.getBean("second_object"));
		System.out.println(c1.getBean("third_object"));
	}

}

