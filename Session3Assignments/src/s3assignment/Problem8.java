package s3assignment;
import java.util.Scanner;
public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    char n=sc.next().charAt(0);
	    if(n=='R' || n=='r')
	    {
	      System.out.println("Red");
	    }
	    else if(n=='W' || n=='w')
	    {
	      System.out.println("White");
	    }
	    else if(n=='B' || n=='b')
	    {
	      System.out.println("Blue");
	    }
	    else if(n=='O' || n=='o')
	    {
	      System.out.println("Orange");
	    }
	    else if(n=='G' || n=='g')
	    {
	      System.out.println("Green");
	    }
	    else if(n=='Y' || n=='y')
	    {
	      System.out.println("Yellow");
	    }
	}
}
