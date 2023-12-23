package DS;

import java.util.Scanner;

public class BinearySearch {
	public static int binearsearch(int arr[],int key_to_search)
	{
		int low=0;
		int high = arr.length-1;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			int mid_index_value = arr[mid];
			if(key_to_search==mid_index_value)
			{
				return mid;
			}
			else if(key_to_search>mid_index_value)
			{
				low = mid+1;
				high = high;
			}
			else {
				high = mid-1;
				low = low;
			}
		}
		System.out.println("Key not found");
		return -1;
		
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Array length=");
		int n = scan.nextInt();
		System.out.println("Array\n");
		int array[] = new int[n];
		
		for(int i=0;i<=array.length-1;i++)
		{
			array[i]= scan.nextInt();
		}
		
		System.out.println("Enter the key element to search\n");
		
		int key = scan.nextInt();
		
		System.out.println(binearsearch(array,key));
	}

}
