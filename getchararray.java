//33.	What is the getChars() method in Java for a String object?
package string;

public class getchararray {
	public static void main(String [] args)
	{
		String name = "Apple Bat Cat";
		char charry[] = new char[5];
		name.getChars(0,4,charry,0);
		System.out.println(charry);
		
		
		}

}
