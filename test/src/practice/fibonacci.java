package practice;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		int frst = 0;
		int snd =1;
		int num;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the how many numbers you want");
		int n = ip.nextInt();
		for(int i=0;i<n;i++) {
			if(i<=1)
				num=i;
			else
				num=frst+snd;
			frst=snd;
			snd=num;
			System.out.print(num+" ");
			
		}
		

	}

}
