package org.testing;

public class GreensBank implements RbiBank {

	@Override
	public void savings() {
		System.out.println("Savings 9%");		
	}

	@Override
	public void deposit() {
		System.out.println("Deposit 6 %");		
	}

	@Override
	public void fixed() {
		System.out.println("fixed 4 %");
	}
	public static void main(String[] args) {
		GreensBank b = new GreensBank();
		b.savings();
		b.deposit();
		b.fixed();
	}

}
