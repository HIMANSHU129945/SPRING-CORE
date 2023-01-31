package jspider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	private int customerId;
	   @Value("111")
	private String customerName;
	   @Value("XYZ")
	private long ph_num;
	   @Value("1234567890")
	private Account accounnt;   // reference variable of interface class
	   @Autowired
	   @Qualifier("savings")
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getPh_num() {
		return ph_num;
	}
	public void setPh_num(long ph_num) {
		this.ph_num = ph_num;
	}
	public Account getAccounnt() {
		return accounnt;
	}
	public void setAccounnt(Account accounnt) {
		this.accounnt = accounnt;
	}
	
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", ph_num=" + ph_num
				+ ", accounnt=" + accounnt + "]";
	}
	
	
}
