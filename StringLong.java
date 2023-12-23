package string;

public class StringLong {
	public static void main(String[] args)
	{
		String str = "1235";
		long str_long = Long.parseLong(str);
		System.out.println(str_long);
		
		long str_lon2 = Long.valueOf(str);
		System.out.println(str_lon2);
		
		
	}

}
