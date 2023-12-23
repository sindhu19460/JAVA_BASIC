package string;

import java.util.Scanner;

public class SubstringReplace {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String str ="geeks for geeks";
		System.out.println("str="+str);
		String substring = str.substring(5);
		System.out.println("Substring="+substring);
		System.out.println("String to replacement");
		String replacement = scan.nextLine();
		
		String replace = str.replaceAll(substring,replacement);
		System.out.println(replace);
		
	}

}
