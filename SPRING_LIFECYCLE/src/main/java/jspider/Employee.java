package jspider;

public class Employee {
	
	private int id;
	private String name;
	
	public void hi() {
		System.out.println("Initializaing An Object");
	}
	public void bye() {
		System.out.println("Destroying Bean Object");
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
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
