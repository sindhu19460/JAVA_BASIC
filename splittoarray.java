package string;

public class splittoarray {
	public static void main(String[] args)
	{
		String str ="Sindhu@Sindhu@Sindhu";
		String[] arr = str.split("@",3);
		for(String a: arr)
		{
			System.out.println(a);
		}
	}

}
