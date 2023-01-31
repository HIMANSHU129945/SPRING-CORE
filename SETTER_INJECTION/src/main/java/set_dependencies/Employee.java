package set_dependencies;

import java.util.Set;

public class Employee {
	
	private int id;
	private String name;
	private Set<String> job_title;
	
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
	public Set<String> getJob_title() {
		return job_title;
	}
	public void setJob_title(Set<String> job_title) {
		this.job_title = job_title;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", job_title=" + job_title + "]";
	}
	
	
	
	
	

}
