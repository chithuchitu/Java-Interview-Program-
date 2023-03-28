package org.testing;

public class C implements A, B {

	@Override
	public void test3() {
		System.out.println("tc3...");
	}

	@Override
	public void test1() {
		System.out.println("tc1...");
	}

	@Override
	public void test2() {
		System.out.println("TC2...");
	}
	// Multiple inheritance child class
	public static void main(String[] args) {
		C cc = new C();
		cc.test1();
		cc.test2();
		cc.test3();
	}

}