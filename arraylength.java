//How do you find the length of an array in Java?

import java.util.Scanner;

public class arraylength {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Array length");

		int n1 = scan.nextInt();
		System.out.println("Array length"+n1+"\n");
		
		int arr[] = new int[n1];
		
		System.out.println("Enter the value for:\n");
		{
			for(int i=0;i<arr.length-1;i++)
			{
				arr[i] = scan.nextInt();
			}
		}
		System.out.println("Array length="+arr.length+"\n");
	}

}
