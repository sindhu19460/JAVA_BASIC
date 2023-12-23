package string;

public class splitintosubstring {
	public static void main(String[] args)
	{
		String str = "This is a string";
		String[] words = str.split(" ");
		System.out.println(words);
		String str2 = "This,is,a,comma-separated,string";
		String[] words2 = str.split(",|-");
		System.out.println(words2);
	}
	
}
