package practice;
import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
try (Scanner ip = new Scanner(System.in)) {
	System.out.println("Enter number :");
	int num = ip.nextInt();
	int r = (int)Math.sqrt(num);
	int f=1;
	for(int i =2;i<=r;i++) {
		if(num%i==0) {
			f++;
		}	
	}
	if(f>1) {
		System.out.println("Non-Prime");
		}else {
			System.out.println("Prime");
		}
}
	}

}
