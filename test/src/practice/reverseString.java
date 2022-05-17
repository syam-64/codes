package practice;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String rev = "";
		System.out.println("Enter your String:");
		String st = ip.next();
		int l =  st.length();
		for(int i=l-1;i>=0;i--) {
			rev= rev+st.charAt(i);
		}
		
System.out.println(rev);
	}
}

