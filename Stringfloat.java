//37.	How to convert a String to a float in Java?

package string;

public class Stringfloat {
	public static void main(String[] args)
	{
		String str = "1234.5";
		float flt_str = Float.parseFloat(str);
		System.out.println(flt_str);
		float flt_str2 = Float.valueOf(str);
		System.out.println(flt_str2);
		
	}

}
