package string;

public class StringDouble {
	public static void main(String []args)
	{
		String str = "123.45";
		System.out.println(str);
		Double d = Double.valueOf(str);
		System.out.println(d);
		Double d1 = Double.parseDouble(str);
		System.out.println(d1);
		boolean b = Boolean.parseBoolean(str);
		System.out.println(b);
		String st1 = "true";
		boolean b1 = Boolean.parseBoolean(st1);
		System.out.println(b1);
		boolean b2 = Boolean.valueOf(st1);
		System.out.println(b2);
	}

}
