package DS;

import java.util.Scanner;

public class SelectionSort {
	public static int[] selectionSort(int data[])
	{
		for(int i=0;i<data.length;i++)
		{
			int index = i;
			for(int j=i+1;j<data.length;j++)
			{
				if (data[j]<data[index])
				{
					index = j;
				}
			}
			int smallnumber = data[index];
			data[index] = data[i];
			data[i]=smallnumber;
		}
		return data;
	}
	
	private static void printnumber(int data[])
	{
		for(int i=0;i<data.length;i++)
		{
			System.out.println(data[i]);
			if(i!=data.length-1)
			{
				System.out.println(" ,");
			}
		}
		
		System.out.println("\n");
	}
	
	
	public static void main(String [] args)
	{
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
			
			printnumber(arr);
			int [] sortedarray = selectionSort(arr);
			printnumber(sortedarray);
	}
	}
}
