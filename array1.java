
import java.util.Scanner; 

public class array1 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		
		for(int i=0;i<=4;i++)
		{
			System.out.println("Enter the value for array\n");
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Array content\n");
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
