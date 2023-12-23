import java.util.Arrays;
import java.util.Scanner;

public class isequal {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Array1 Length\n");
		int array1[] = new int[scan.nextInt()];
		
		System.out.println("Array2 Length\n");
		int array2[] = new int[scan.nextInt()];
		
		System.out.println("Array one input:\n");
		for(int i=0;i<array1.length-1;i++)
		{
			array1[i]=scan.nextInt();
		}
		
		System.out.println("Array two input:\n");
		for(int i=0;i<array2.length-1;i++)
		{
			array2[i]=scan.nextInt();
		}
		
		System.out.println("Condition checking\n");
		
		System.out.println("Is array1 and Array2 are Equal="+Arrays.equals(array1,array2));
	}

}
