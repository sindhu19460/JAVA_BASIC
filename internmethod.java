package string;

public class internmethod {
	public static void main(String[]args)
	{
		String s1 = new String("Python");
		String s2 ="Python";
		
		String s3 = s1.intern(); //return string from pool, now it will be same as s1
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
	}

}
