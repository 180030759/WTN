package s3assignment;
import java.util.Scanner;
public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    char n=sc.next().charAt(0);
	    if(n>=65 && n<=90)
	    {
	      int m=(int)n+32;
	      n=(char)m;
	      System.out.println(n);
	    }
	    else
	    {
	      int m=(int)n-32;
	      n=(char)m;
	      System.out.println(n);
	    }
	}
}
