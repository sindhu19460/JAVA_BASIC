import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Array length \n");
		int arr[] = new int[scan.nextInt()];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Please enter the key\n");
		int key = scan.nextInt();
		
			int low =0;
			int mid;
			int high = arr.length-1;
			
			while(low<=high)
			{
				mid = (low+high)/2;
				if(key==arr[mid])
				{
					System.out.println("Key found at"+mid+"\n");
					System.exit(0);
				}
				else if(key>arr[mid])
				{
					low = mid+1;
					high = high;
				}
				else
				{
					low = low;
					high = mid-1;
				}
				
			}
			System.out.println("Key not found ");
	}
}
