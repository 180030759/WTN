package s3assignment;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}
