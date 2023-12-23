import java.util.Scanner;

public class array3{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String arr[] = new String[5];
		
		for(int i=0;i<=4;i++)
		{
			System.out.println("Enter array value\n");
			arr[i] = scan.next();
		}
		
		System.out.println("Values are\n");
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
