package one_to_many;

import java.util.Set;

public class Branch {
	
	private int b_id;
	private String b_name;
	private Set<Student> students;
	
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Branch [b_id=" + b_id + ", b_name=" + b_name + ", students=" + students + "]";
	}
	
	
}
