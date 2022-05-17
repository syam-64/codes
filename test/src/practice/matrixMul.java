package practice;

import java.util.Scanner;

public class matrixMul {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter First matrix Rows:");
		int n1 = ip.nextInt();
		System.out.println("Enter First matrix Colums:");
		int m1 = ip.nextInt();
		int x[][]=new int[n1][m1];
		System.out.println("Enter Second matrix Rows:");
		int n2 = ip.nextInt();
		System.out.println("Enter Second matrix Colums:");
		int m2 = ip.nextInt();
		int y[][]=new int[n2][m2];
		int z[][]= new int[n1][m2];
		if(n2!=m1) {	
			System.out.println("Multiplication is not possible");
		}else {
			System.out.println("Enter First matrix elements : ");
			for(int i=0;i<n1;i++) {
				for(int j=0;j<m1;j++) {
					x[i][j]=ip.nextInt();
				}
			}
			System.out.println("Enter Second matrix elements : ");
			for(int i=0;i<n2;i++) {
				for(int j=0;j<m2;j++) {
					y[i][j]=ip.nextInt();
				}
			}
			for(int i =0;i<n1;i++) {
				for(int j=0;j<m2;j++) {
					z[i][j]=0;
					for(int k=0;k<m1;k++) {
						z[i][j]+=x[i][k]*y[k][j];
					}
					System.out.print(z[i][j]+" ");
				}
				System.out.println();
			}
		}	
}
}
