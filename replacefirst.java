//44.	What is the replaceFirst() method in Java for a String object
package string;

import java.util.Scanner;

public class replacefirst {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string=");
		String str = scan.nextLine();
		System.out.println("Substring=");
		String substring = scan.nextLine();
		System.out.println("String to replce=");
		String replacement = scan.nextLine();
		
		String replacestring = str.replaceFirst(substring,replacement);
		
		System.out.println("ReplaceFirst= "+replacestring);
		
		
		
		
		
				
	}
}
