//How do you sort an array in Java?

import java.util.Arrays;
import java.util.Scanner;

public class arraysort {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Array length");

		int n1 = scan.nextInt();
		int arr[] = new int[n1];
		
		System.out.println("Enter the value for:\n");
		{
			for(int i=0;i<=arr.length-1;i++)
			{
				arr[i] = scan.nextInt();
			}
		}
		
		Arrays.sort(arr);
		System.out.println("Sorted array:\n");
		{
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
