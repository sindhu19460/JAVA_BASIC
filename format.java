package string;

public class format {
	public static void main(String[] args)
	{
		String str = "geeks for geeks";
		
		String s = String.format("My company name is = %s",str);
		String str2 = String.format("My answer is %.8f", 47.65734);
		String str3 = String.format("My answer is %15.8f",
                                47.65734);

	    // Print and display strings
	    System.out.println(s);
	    System.out.println(str2);
	    System.out.println(str3);
		
	}

}
