//26.	What is the replaceAll() method in Java for a String object?
package string;

import java.util.Scanner;

public class allreplace {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str =" hallo walcoma";
		System.out.println(str.replaceAll("a","e"));
		
		System.out.println("Enter the string=");
		String s1 = scan.nextLine();
		
		System.out.println("replace value=");
		String replace = scan.nextLine();
		
		System.out.println("Replace value by give string=");
		String replace_by = scan.nextLine();
		
		
		String replaced = s1.replaceAll(replace,replace_by);
		
		System.out.println("Replaced value="+replaced);
	}

}
