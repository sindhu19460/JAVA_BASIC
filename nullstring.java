package string;

import java.util.Scanner;

public class nullstring {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scan.nextLine();
		
		if(str.equals("")) {
			System.out.println("String is empty");
			}
		else {
			System.out.println("String have data"+str);
		}
		}

}
