//31.	How to iterate over each character in a String in Java?
package string;

import java.util.Scanner;

public class iterateString {
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the string=");
		String s = scan.nextLine();
		int length = s.length();
		
		for(int i=0;i<length;i++)
		{
			char c = s.charAt(i);
			System.out.println(c);
		}
		
	}

}
