package s3assignment;
import java.util.*;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n==0) {
			System.out.println("Zero");
		}
		else if(n<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Positive");
		}
	}

}
