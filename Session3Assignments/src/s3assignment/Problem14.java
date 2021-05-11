package s3assignment;
import java.util.Scanner;
public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("java Sample");
	    int n=sc.nextInt();
	    int c=0;
	    for(int i=2;i<=n/2;i++)
	    {
	    	if(n%i==0)
	        {
	    		c=1;
	            break;
	        }
	    }
	    if(n==1 || n==0)
	    {
	    	System.out.println(n+" neither Prime  nor composite Number");
	    }
	    else
	    {
	    	if(c==0)
	        {
	    		System.out.println(n+" is a Prime Number");
	        }
	        else
	        {
	            System.out.println(n+" is Not a Prime Number");
	        }
	    }
	}
	
}
