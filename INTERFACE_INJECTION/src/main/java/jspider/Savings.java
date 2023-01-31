package jspider;

import org.springframework.stereotype.Component;

@Component
public class Savings implements Account{

	@Override
	public void withdraw() {
		System.out.println("withdraw from savings");
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit to savings");
		
	}

}
