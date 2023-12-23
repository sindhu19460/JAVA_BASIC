//62.	How to reverse the order of words in a String in Java
package string;

public class reverseorder {
	public static void main(String args[])
	{
		String str = "Hello world";
		
		StringBuilder sb = new StringBuilder(str);
		
		sb.reverse();
		
		String reverse = sb.toString();
		System.out.println(reverse);
	}

}
