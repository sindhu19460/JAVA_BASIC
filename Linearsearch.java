import java.util.Scanner;

public class Linearsearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Array Size\n");
		int n = scan.nextInt();
		System.out.println("Array\n");
		int array[] = new int[n];
		
		for(int i=0;i<=array.length-1;i++)
		{
			array[i]= scan.nextInt();
		}
		
		System.out.println("Enter the key element to search\n");
		
		int key = scan.nextInt();
		
		for(int i=0;i<=array.length-1;i++)
		{
			if(key == array[i])
			{
				System.out.println("Array found at"+i+"index\n");
				System.exit(0);
			}
		}
		
		System.out.println("Key Not found");
		
	}

}
