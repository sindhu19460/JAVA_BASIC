import java.util.Scanner;

public class array2 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		float arr[] = new float[5];
		
		for(int i=0;i<=4;i++)
		{
			System.out.println("Enter array value\n");
			arr[i] = scan.nextFloat();
		}
		
		System.out.println("Values are\n");
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
