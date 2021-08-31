package pallavi;
import java.util.Scanner;
public class search {

	public static void main(String[] args) 
	{
         int arr[]= {10,99,120,23,7,56,9};
         int n = arr.length;
         for(int i=0;i<arr.length;i++)
         { 
        	 for( int j=i+1; j<arr.length;j++)
        	 {
        		if(arr[i]>arr[j])
        		{
        			int temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        	      }
        	 }
        	 
         }
          
      	 System.out.println("sorted array=");
      	 for(int i=0;i<n-1;i++)
      	 {
      		 System.out.print(arr[i]+ ",");
      	 }
      	 System.out.println(arr[n-1]);
         
	}

}