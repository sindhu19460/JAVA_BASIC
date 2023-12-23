
class shallowcopyexp {
	int ABC = 30;
}

public class shallowcopy{
	public static void main(String[] args)
	{
		shallowcopyexp obj1 = new shallowcopyexp();
		
		shallowcopyexp obj2 = obj1;
		
		obj2.ABC = 10;
		System.out.println("obj1="+obj1.ABC);
		System.out.println("obj2="+obj2.ABC);
	}

}
