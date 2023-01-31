package map_dependencies;

import java.util.Map;

public class Country {
	
	private String country_name;
	private Map< String , String > state_and_language;
	
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public Map<String, String> getState_and_language() {
		return state_and_language;
	}
	public void setState_and_language(Map<String, String> state_and_language) {
		this.state_and_language = state_and_language;
	}
	
	@Override
	public String toString() {
		return "Country [country_name=" + country_name + ", state_and_language=" + state_and_language + "]";
	}
	
	

}
