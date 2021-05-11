package s3assignment;
import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,x,flag=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		x=sc.nextInt();
		for(i=0;i<n;i++) {
			if(a[i]==x) {
				flag=1;
				break;
			}
			
		}
		if(flag==1) {
			System.out.println(i);
		}
		else {
			System.out.println(-1);
		}
	}

}
