package s3assignment;
import java.util.Scanner;
public class Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    int a[][]=new int[n][n];
	    for(i=0;i<3;i++)
	    {
	      for(j=0;j<3;j++)
	      {
	        a[i][j]=sc.nextInt();
	      }
	    }
	    int max=a[0][0];
	    for(i=0;i<3;i++)
	    {
	      for(j=0;j<3;j++)
	      {
	        if(a[i][j]>max)
	        {
	          max=a[i][j];
	        }
	      }
	    }
	    for(i=0;i<3;i++)
	    {
	      for(j=0;j<3;j++)
	      {
	        System.out.print(a[i][j]+" ");
	      }
	      System.out.println();
	    }
	    System.out.println("The biggest number is:"+max);
	}

}
