package set_dependencies;

import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Class {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("set_dependencies/NewFile.xml");
		Employee e=(Employee)c1.getBean("employee_1");
		System.out.println(e);
		
		Set<String> s=e.getJob_title();
		System.out.println(s.getClass());
		
	}

}
