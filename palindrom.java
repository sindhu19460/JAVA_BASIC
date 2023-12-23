//34.	How to check if a String is a palindrome in Java?
package string;

import java.util.Scanner;

public class palindrom {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value=");
		String str = scan.next();
		System.out.println("String beforing reversing="+str);
		char arr[] = str.toCharArray();
		
		char arr2[] = new char[arr.length];
		int j = arr.length-1;
		for(int i=0;i<=arr.length-1;i++)
		{
			arr2[j]=arr[i];
			j--;
		}
		String s1 = new String(arr2);
		System.out.println("Array content after reversing="+s1);
		
		if(str.equalsIgnoreCase(s1))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not equal");
		}
		
		
	}

}
