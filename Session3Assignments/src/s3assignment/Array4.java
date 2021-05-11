package s3assignment;
import java.util.Scanner;
public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for (i=0;i<n;i++) {
            System.out.print((char)a[i] + " ");
        }
        System.out.println();
	}

}
