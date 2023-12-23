package string;

public class suffixprefix {
	public static void main(String[] args)
	{
		String str = "Hello";
		boolean startwith = str.startsWith("H");
		boolean endwith = str.endsWith("o");
		boolean startwith1 = str.startsWith("Hi");
		boolean endwith1 = str.endsWith("Hello");
		
		System.out.println(startwith);
		System.out.println(endwith);
		System.out.println(startwith1);
		System.out.println(endwith1);
		
	}
}
