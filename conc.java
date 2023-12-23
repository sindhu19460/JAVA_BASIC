package string;

import java.util.Scanner;

public class conc {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the String one value=");
		String s1 = scan.nextLine();
		System.out.println("Please enter the String Two value=");

		String s2 = scan.nextLine();
		
		s2 = s1.concat(s2);
		System.out.println("Concat="+s2+"\n");
	}
	

}
