package co.jsoftware;

import java.util.Scanner;

public class Primeno {
	public static void main(String[] args) {
		int temp;
		boolean isaPrime = true;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = scan.nextInt();
		scan.close();
		for (int i = 2; i <n; i++) {
			temp = n % i;
			if (temp == 0) {
				isaPrime = false;
				break;

			}

		}
		if (isaPrime) {
			System.out.println(n + " is a prime no");
		} else {
			System.out.println(n + " is not a prime no");
		}

	}

}
