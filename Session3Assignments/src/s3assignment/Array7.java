package s3assignment;
import java.util.Scanner;
public class Array7 {
	public static int removeDuplicateElements(int arr[], int n){  
		if (n==0 || n==1){  
              return n;  
          }    
          int j = 0;//for next element  
          for (int i=0; i < n-1; i++){  
              if (arr[i] != arr[i+1]){  
                  arr[j++] = arr[i];  
              }  
          }  
          arr[j++] = arr[n-1];  
          return j;  
      }  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] arr=new int[n];
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		 
        int length = arr.length;  
        length = removeDuplicateElements(arr, length);  
        //printing array elements  
        for (i=0; i<length; i++)  
           System.out.print(arr[i]+" ");
	}

}
