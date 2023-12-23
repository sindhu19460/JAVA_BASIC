package string;

public class StringChar {
	public static void main(String[] args)
	{
		String s1 = "Hello world!";
		System.out.println("s1="+s1);
		char chararr[] = new char[s1.length()];
		
		for(int i=0;i<s1.length();i++)
		{
			chararr[i]= s1.charAt(i);
		}
		
		for(char c:chararr)
		{
			System.out.println(c);
		}
	}
}
