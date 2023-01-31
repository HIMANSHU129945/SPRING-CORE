package list_dependencies;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Class {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("list_dependencies/NewFile.xml");
		
		//System.out.println(c1.getBean("student_1"));
		
		Student s1=(Student) c1.getBean("student_1");
		System.out.println(s1);
		
		List<String> s=s1.getSubject();
		System.out.println(s.getClass());
	}

}
