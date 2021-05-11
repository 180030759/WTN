package s3assignment;
import java.util.Scanner;
public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    char n=sc.next().charAt(0);
	    int m=sc.nextInt();
	    if(n=='f' && m>=1 && m<=58)
	    {
	      System.out.println("Percentage of Interest is 8.2%");
	    }
	    else if(n=='f' && m>=59 && m<=100)
	    {
	      System.out.println("Percentage of Interest is 9.2%");
	    }
	    else if(n=='m' && m>=1 && m<=58)
	    {
	      System.out.println("Percentage of Interest is 8.4%");
	    }
	    else if(n=='m' && m>=59 && m<=100)
	    {
	      System.out.println("Percentage of Interest is 10.5%");
	    }
	}
}
