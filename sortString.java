//56.	How to sort a String array in Java
package string;

import java.util.Arrays;
import java.util.Scanner;

public class sortString {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("array length");
		int n = scan.nextInt();
		String[] countries = new String[n]; 
		System.out.println("Array data-------------");
		for(int i=0;i<n;i++)
		{
			countries[i]=scan.nextLine();
		}
		
		int size = countries.length;  
		System.out.println("Array size="+size);
		
		System.out.println("Array before sorting\n");
		for(int i=0;i<=size-1;i++)
		{
			System.out.println(countries[i]);
			System.out.println("----------------------------");
		}
		
		System.out.println("After Sorting.....................");
		
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(countries[i].compareTo(countries[j])>0)   
				{
					String temp = countries[i];
					countries[i] = countries[j];
					countries[j]= temp;
				}
			}
		}
	 System.out.println(Arrays.toString(countries));
	}
}
