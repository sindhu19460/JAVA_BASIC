//43.	How to check if a String contains only digits in Java
package string;

import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class stringcontnum {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value=");
		String s1 =scan.nextLine();
			
		System.out.println("String1 ="+s1);
		System.out.println("----------------");
			
		boolean dig = s1.chars().allMatch(Character::isDigit);
		System.out.println(dig);
	}

}
