package practice;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	System.out.println("Enter number: ");
	int num = ip.nextInt();
	int fac =1;
	for(int i=num;i>=1;i--){
		fac*=i;
	}
	System.out.println(fac);
	}

}
