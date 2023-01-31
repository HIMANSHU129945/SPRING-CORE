package map_dependencies;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_class {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("map_dependencies/NewFile.xml");
		Company c=(Company) c1.getBean("abc");
		System.out.println(c);
		Map<Integer, String> ml=c.getEmpCodeAndName();
		System.out.println(ml.getClass());
	}

}
