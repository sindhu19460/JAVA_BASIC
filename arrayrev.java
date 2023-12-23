import java.util.Scanner;

public class arrayrev {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array length\n");
		int n = scan.nextInt();
		
		//creating array
		int arrayone[] = new int[n];
		
		//Adding 
		System.out.println("Enter the array value\n");
		for(int i=0;i<=arrayone.length-1;i++)
		{
			arrayone[i]=scan.nextInt();
		}
		
		
		//Creating another array
		
		int arraytwo[] = new int[arrayone.length];
		int j = arrayone.length-1;
		
		for(int i=0;i<=arrayone.length-1;i++)
		{
			arraytwo[j]=arrayone[i];
			j--;
		}
		
		
		//print arrayone data
		
		System.out.println("Arrayone data\n");
		
		for(int i=0;i<=arrayone.length-1;i++)
		{
			System.out.println( arrayone[i]+" "+"\n");
		}
		
		System.out.println("End one arrayone\n");
		
		System.out.println("Arraytwo data\n");
		
		for(int i=0;i<=arraytwo.length-1;i++)
		{
			System.out.println(arraytwo[i]+" "+"\n");
		}
		
	}

}
