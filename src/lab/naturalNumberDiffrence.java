package lab;

import java.util.Scanner;

public class naturalNumberDiffrence {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a range: ");
		int n= sc.nextInt();

		System.out.println("Difference between ");

	}

	static int calculateDifference(int n) {
		int sum1=0;
		int sum2=0;
		int difference=0;
		for(int i=0; i<=n;i++) {
			sum1 += (i*i);
			sum2 += i;
		}
		int squareOfSum=(sum2*sum2);
		difference= sum1-squareOfSum;
		return difference;

    }
}
