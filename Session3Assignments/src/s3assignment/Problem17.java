package s3assignment;
import java.util.Scanner;
public class Problem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int r=0;
	    while(n!=0)
	    {
	      int s=n%10;
	      r=r*10+s;
	      n=n/10;
	    }
	    System.out.println(r);
	}

}
