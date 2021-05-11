package s3assignment;

public class Problem19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,c=5;
	    while(c>0)
	    {
	      if(i%2==0 && i%3==0 && i%5==0)
	      {
	        System.out.println(i+" ");
	        c--;
	      }
	      i++;
	    }
	}

}
