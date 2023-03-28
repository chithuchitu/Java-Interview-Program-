package iptdec22.org;

import java.util.Arrays;

public class IptDay2Task {

	public static void main(String[] args) {
		int a[] = { 20, 12, 90, 30, 50, 10 };
		Arrays.sort(a);
		// AFTER SORTING
		System.out.println("sorted array value:");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		// Min value
		System.out.println("minimum Value:" + a[0]);
		// Max value
		System.out.println("Maximum Value:" + a[a.length - 1]);
		// second Minimum Value
		System.out.println("2nd Minimum Value:" + a[1]);
		System.out.println("2nd Maximum Value:" + a[a.length - 2]);
	}

}
