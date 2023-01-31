package jspider;

public class Current implements Account{

	@Override
	public void withdraw() {
		System.out.println("withdraw from current");
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit to current");
		
	}

}
