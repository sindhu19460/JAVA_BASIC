//36.	What is the compareToIgnoreCase() method in Java for a String object?
package string;

import java.util.Scanner;

public class comparetoignorecase {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string1=");
		String str1 = scan.nextLine();
		System.out.println("Enter the string2=");
		String str2 = scan.nextLine();
		
		System.out.println(str1.compareToIgnoreCase(str2));
		
	}
}
