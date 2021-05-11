package s3assignment;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		if (args.length == 0) {
			System.out.println("No Values");
		} else {
			for (i = 0; i < args.length; i++) {
				System.out.print(args[i]);
				if (i < args.length - 1) 
					System.out.print(", ");
			}
		}
	}

}
