import java.util.ArrayList;

public class listarray {
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("python");
		list.add("java");
		list.add("C");
		list.add("C++");
		list.add("Ruby");
		list.add("R");
		System.out.println("List data="+list+"\n");
		
		int list_length = list.size();
		System.out.println("String Array list size"+list_length+"\n");
		String array_string [] = new String[list_length];
		
		list.toArray(array_string);
		
		for (String string:array_string) {
		System.out.println("List to array="+string+"\n");
		}
	}

}
