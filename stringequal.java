package string;

import java.util.Scanner;

public class stringequal {
	public static  void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the String one value=\n");
		String s1 = scan.nextLine();
		System.out.println("Please enter the String Two value=\n");
		String s2 = scan.nextLine();
		
		if(s1==s2)
		{
			System.out.println("String are equal using reference");
		}
		else
		{
			System.out.println("String are not equal using reference");	
		}
		
		if(s1.equals(s2))
		{
			System.out.println("Deep comparsion both string are equal\n");
		}
		else
		{
			System.out.println("Deep comparsion both string are not equal\n");
		}
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Both string are equal using equalsignorecase\n");
		}
		else
		{
			System.out.println("Both string are not equal using equalsignorecase\n");

		}
		
	}

}
