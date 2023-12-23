package methods;

public class stringcontainS {
	boolean check(String str)
	{
		char []arr = str.toCharArray();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]=='k'||arr[i]=='K')
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		stringcontainS checkstr = new stringcontainS();
		String str = "Sindhu";
		boolean res = checkstr.check(str);
		if(res == true)
		{
			System.out.println("string contains k");
					}
		else {
			System.out.println("not contains k");
		}
		
	}

}
