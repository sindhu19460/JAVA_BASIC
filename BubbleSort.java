package DS;

import java.util.Scanner;

public class BubbleSort {
	public static void bubblesort(int arr[])
	{
		System.out.println("Array before sorting\n");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
		}
		int temp;
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		System.out.println("Array after sorting\n");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Array Size\n");
		int n = scan.nextInt();
		System.out.println("Array\n");
		int array[] = new int[n];
		for(int i=0;i<=array.length-1;i++)
		{
			array[i]= scan.nextInt();
		}
		
		bubblesort(array);
	}
}
