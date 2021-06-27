package co.jsoftware;

import java.util.Scanner;

public class Hollow_pyramid {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers in rows");
		int n = scan.nextInt();
		char c = scan.next().charAt(0);
		
		for (int i = 1; i <= n - 1; i++) {
			for (int j = 1; j <= n - 1; j++) {
				System.out.println(" ");
				for (int k = 1; k <= 2 * i - 1; k++) {
					if (k == 1 || k == 2 * i - 1 || i == n) {
						System.out.println("*");
					} else {
						System.out.println(" ");
					}
					n--;
					System.out.println("*");
				}
				return;
			}
		}
	}
}
