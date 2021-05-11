package s3assignment;
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,s=0;
		float avg;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++) {
			s=s+a[i];
		}
		avg=(float)s/n;
		System.out.println(s);
		System.out.printf("%.2f",avg);
	}

}
