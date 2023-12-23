package string;

public class substringindexof {
	public static void main(String[] args)
	{
		String s1 = "Hello planet earth, you are a great planet.";
		String sub = s1.substring(0,18);
		System.out.println(sub);
		System.out.println(s1.indexOf(sub));
		System.out.println(s1.contains(sub));
		System.out.println(s1.lastIndexOf(sub));
	}

}
