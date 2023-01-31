package jspider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("jspider/NewFile.xml");
		System.out.println(c1.getBean("emp"));
		
		if(c1 != null)
		{
			c1.close();
		}
	}

}
