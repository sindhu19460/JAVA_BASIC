
//The trim function to remove whitespaces from the left and right of 
//the string can be used when we want to join multiple strings together.

package string;

public class trim {
	public static void main(String args[])
	{
		String x = "Educadd ";
		String y = "Thinkworks ";
		String z ="Dvg";
		
		System.out.println(x+y+z);
		
		System.out.println(x.trim()+y.trim()+z.trim());
	}

}
