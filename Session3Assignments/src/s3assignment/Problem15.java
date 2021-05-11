package s3assignment;
import java.util.Scanner;
public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int s=0,r=0;
	    while(n>0)
	    {
	    s=n%10;
	    n=n/10;
	    r=r+s;
	    }
	    System.out.println(r);
	}

}
