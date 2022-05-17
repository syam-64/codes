package practice;

import java.util.Scanner;

public class paliindrom {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = ip.nextInt();
		int sum =0,rem=0;
		int a=0;
		a=num;
		while(num>0) {
			rem = num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}

	if(a==sum) {
		System.out.println("palindrom");
	}else {
		System.out.println("not a palindrom");
	}
	}

}
