class deepcopyexp
{
	int abc = 30;
}
public class deepcop {
	public static void main(String[] args)
	{
		deepcopyexp d1 = new deepcopyexp();
		deepcopyexp d2 = new deepcopyexp();
		
		d1.abc = 40;
		d2.abc = 50;
		
		System.out.println("d1="+d1.abc+"\n");
		System.out.println("d2="+d2.abc+"\n");
	}

}
