package string;

public class ignorecase {
	public static void main(String args[])
	{
		String s1 = "Hello";
		String s2 = "hello";
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Both data same");
		}
		else
		{
			System.out.println("Both are diff");
		}
	}

}
