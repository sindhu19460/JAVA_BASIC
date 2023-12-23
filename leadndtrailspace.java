package string;

public class leadndtrailspace {
	public static void main (String[] args)
	{
		String s = " Hello, World! ";
		System.out.println(s.trim());
		System.out.println(s.replace(" ",""));
		/*String str = "  Hello World !!   ";

		System.out.println( str.strip() );      //"Hello World !!"

		System.out.println( str.stripLeading() ); //"Hello World !!   "

		System.out.println( str.stripTrailing() );  //"  Hello World !!"*/

}
}