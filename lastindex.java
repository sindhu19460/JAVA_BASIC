package string;

import java.util.Scanner;

public class lastindex {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string=");
		String str = scan.nextLine();
		System.out.println("enter the char to find the index");
		String find_index = scan.next();
		System.out.println("index found @ "+str.lastIndexOf(find_index));
		System.out.println("after this index length");
		int after_this_index = scan.nextInt();
		System.out.println("index found @ "+str.lastIndexOf(find_index,after_this_index));

		
	}
}
