package map_dependencies;

import java.util.Map;

public class Company {
	
	private String companyName;
	private Map<Integer,String> empCodeAndName;
	public Company(String companyName, Map<Integer, String> empCodeAndName) {
		super();
		this.companyName = companyName;
		this.empCodeAndName = empCodeAndName;
	}
	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public Map<Integer, String> getEmpCodeAndName() {
		return empCodeAndName;
	}


	public void setEmpCodeAndName(Map<Integer, String> empCodeAndName) {
		this.empCodeAndName = empCodeAndName;
	}


	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", empCodeAndName=" + empCodeAndName + "]";
	}
	
	

}
