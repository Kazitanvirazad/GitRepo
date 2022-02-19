package com.kazitanvir;

public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		print();

		pattern();
	}

	public static void print() {
		System.out.println("I work in Publicis Sapient");

	}

	public static void pattern() {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int space = n - i; space > 0; space--) {
				System.out.print("  ");
			}
			for (int star = 1; star <= i; star++) {
				System.out.print("* ");
			}
			for (int bStar = 1; bStar <= i - 1; bStar++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
