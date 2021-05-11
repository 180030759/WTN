package s3assignment;

public class Problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10;i<=100;i++)
		{
			int  c=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					c=c+1;
					break;
					}
				}
			if(c==0 && i!=1)
			{
				System.out.println(i);
			}
		}
	}
}
