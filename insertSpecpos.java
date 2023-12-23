//18.	How do you insert an element into an array at a specific position in Java
import java.util.Arrays;
import java.util.Scanner;

public class insertSpecpos {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Array length\n");
		int array[] = new int[scan.nextInt()];
		
		for(int i=0;i<=array.length-1;i++)
		{
			array[i] = scan.nextInt();
		}
		System.out.println("Array Index Postion\n");
		int IndexPostion = scan.nextInt();
		
		System.out.println("Enter new value\n");
		int new_value = scan.nextInt();
		
		System.out.println("Original array="+Arrays.toString(array));
		
		
		for(int i=array.length-1;i>IndexPostion;i--)
		{
			array[i] = array[i-1];
		}
		
		array[IndexPostion] = new_value;
		
		System.out.println("After inserting the value to particular index"+Arrays.toString(array)+"\n");
	}
}
