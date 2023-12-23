//How to remove all non-alphabetic characters from a String in Java?
package string;

import java.util.Scanner;

public class nonalpa {
	public static void main (String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string= ");
		String str = scan.nextLine();
		String result = str.replaceAll("[^a-zA-Z]"," ");
		System.out.println(result);
		
	}

}
