package string;

import java.util.Arrays;
import java.util.Scanner;

public class removestring {
	    public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
	    	System.out.println("Enter the string=");
	    	String str = scan.nextLine();
	    	char arr[] = str.toCharArray();
	    	
	    	for(int i=0;i<=str.length()-1;i++)
	    	{
	    		arr[i]=str.charAt(i);
	    	}

	    	for( char c:arr)
	    	{
	    		System.out.println(c);
	    	}
	    	
	    	System.out.println("Enter the char to remove=");
	    	int removevalue = scan.nextInt();
	    	
	    	for(int i=removevalue;i<arr.length-1;i++)
	    	{
	    		arr[i]=arr[i-1];
	    	}
	    	System.out.println("after removing"+Arrays.toString(arr));
	    }
}
