package s3assignment;
import java.util.Scanner;
public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,sum=0;
		Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    int a[]=new int[n];
	    for(i=0;i<n;i++)
	    {
	      a[i]=sc.nextInt();
	    }
	    for(i=0;i<n-1;i++)
	    {
	    	if (a[i] == 6) {
	            for (j = i + 1; j < a.length; j++) {
	                if (a[j] == 7) {
	                    i = j+1;
	                    continue;
	                }
	            }
	        }
	        sum += a[i];
	    }
	    System.out.println(sum);
	}

}
