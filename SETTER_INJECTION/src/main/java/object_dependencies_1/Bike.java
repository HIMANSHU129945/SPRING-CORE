package object_dependencies_1;

public class Bike {
	
	private int bike_id;
	private String bike_name;
	
	public int getBike_id() {
		return bike_id;
	}
	public void setBike_id(int bike_id) {
		this.bike_id = bike_id;
	}
	public String getBike_name() {
		return bike_name;
	}
	public void setBike_name(String bike_name) {
		this.bike_name = bike_name;
	}
	
	@Override
	public String toString() {
		return "Bike [bike_id=" + bike_id + ", bike_name=" + bike_name + "]";
	}
	

}
