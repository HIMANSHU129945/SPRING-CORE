package list_dependencies;

import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_class {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("list_dependencies/NewFile.xml");
		Student s1=(Student)c1.getBean("abc");
		System.out.println(s1);
		List <String> s2=s1.getSubjects();
		System.out.println(s2.getClass());
		
	}
}
