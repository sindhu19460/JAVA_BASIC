//48.	How to remove duplicates from a String in Java
package string;

import java.util.Arrays;
import java.util.Scanner;

public class removedupli {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the char= ");
		char str[] = scan.nextLine().toCharArray();
		int n = str.length;
		System.out.println("length of array="+n);
		int index = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(str[i]==str[j])
				{
					System.out.println("Duplicate char arr="+str[j]);
					index ++;
					break;
				}
			}
		}	
	}

}
