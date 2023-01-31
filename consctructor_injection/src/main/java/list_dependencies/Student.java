package list_dependencies;

import java.util.List;
public class Student {
	
	private int id;
	private String name;
	private List<String> subjects;
	public Student(int id, String name, List<String> subjects) {
		super();
		this.id = id;
		this.name = name;
		this.subjects = subjects;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subjects=" + subjects + "]";
	}
	
	
}
