package methods;

public class method4 {
	int add(int x,int y)
	{
		int z = x+y;
		return z;
	}
	
	public static void main(String[] args) {
		method4 m4 = new method4();
		int a = 30;
		int b = 40;
		
		System.out.println(m4.add(a,b));
		
	}

}
