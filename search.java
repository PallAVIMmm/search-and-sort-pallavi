package pallavi;
import java.util.Scanner;
public class search {

	public static void main(String[] args) 
	{
         int arr[]= {10,4,23,7,56,9};
         int ele;
         int position=0;
         Scanner sc = new Scanner(System.in);
         System.out.println(" enter item?");
         ele = sc.nextInt();
         for(int i=0;i<arr.length;i++)
         {
        	 if(arr[i]==ele)
        	 {
        		 position = i+1;
        		 break;
        	 }
        	 else 
        		 position =0;
         }
         
         
         if(position !=0)
             System.out.println("Element found at "+ " "+ position);
       else
      	 System.out.println("Element not found in this array");
         
	}

}
