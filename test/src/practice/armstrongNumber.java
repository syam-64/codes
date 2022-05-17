package practice;

import java.util.Scanner;

public class armstrongNumber {

	public static void main(String[] args) {
		try (Scanner ip = new Scanner(System.in)) {
			System.out.println("Enter Number:");
			int num = ip.nextInt();
			int sum = 0, a = 0;
			a = num;
			while (num > 0) {
				int rem = num % 10;
				sum += Math.pow(rem, 3);
				num = num / 10;
			}
			if (a == sum) {
				System.out.println("Armstrong");
			} else {
				System.out.println("Not an Armstrong");
			}
		}

	}

}
