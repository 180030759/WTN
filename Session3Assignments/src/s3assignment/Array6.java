package s3assignment;
import java.util.Scanner;
public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,temp;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
				    a[i]=a[j];
				    a[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
