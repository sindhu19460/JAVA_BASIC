import java.util.Scanner;

public class array2d {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Array row size\n");
		int n = scan.nextInt();
		
		int arr[][]= new int[n][];
		System.out.println("col array size\n");
		arr[0] = new int[4];
		arr[1] = new int[3];
		arr[2] = new int[4];
		arr[3] = new int[2];
		arr[4] = new int[3];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
		}
		
		System.out.println("Array LEngth\n");
		
		System.out.println("array length[row]="+arr.length);
		
		for(int i=0;i<arr.length;i++)
		{
			int currentlength = arr[i].length;
			System.out.println("Current length of array[col]="+currentlength);
		}
	}
	
	
}