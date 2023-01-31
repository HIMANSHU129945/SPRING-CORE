package constructor_Ambiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Class {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("constructor_Ambiguity/NewFile.xml");
		System.out.println(c1.getBean("int"));
//		System.out.println(c1.getBean("string"));
//		System.out.println(c1.getBean("double"));
	}

}
