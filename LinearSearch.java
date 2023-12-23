package DS;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Array length=");
		int length_array = scan.nextInt();
		int arr[] = new int[length_array];
		System.out.println("insert array value");
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter Key");
		int key = scan.nextInt();
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(key==arr[i])
			{
				System.out.println("Key found at index"+i);
				System.exit(0);
			}	
		}
		System.out.println("Key Not found");
	}

}
