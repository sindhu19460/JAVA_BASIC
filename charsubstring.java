//7.	What is the substring() method in Java? 
package string;

import java.util.Scanner;

public class charsubstring {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Substring=");
		String s1 = scan.nextLine();
		String sub = s1.substring(0,5);
		
		String replacestring = sub.replace('H','j');
		System.out.println("replacestring="+replacestring);
	}

}
