package methods;

public class method2 {
	void add(int x, int y)
	{
		int z = x + y;
		System.out.println("add="+z);
	}
	public static void main(String[] args)
	{
		method2 m1 = new method2();
		int a = 30;
		int b = 40;
		m1.add(a,b);
		
	}
	

}
