package string;

import java.util.Scanner;

public class uppertolower {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide the value:\n");
		String s1 = scan.nextLine();
		System.out.println(s1.toLowerCase());
		System.out.println("TOUPPERCASE:\n");
		String s2 = s1;
		System.out.println(s2.toUpperCase());
	}

}
