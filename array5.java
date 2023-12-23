import java.util.Scanner;

public class array5 {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Row\n");
		int n1 = scan.nextInt();
		System.out.println("Column\n");
		int n2 = scan.nextInt();
		
		int array[][] = new int[n1][n2];
		
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.println("eneter the marks="+i+"student="+j+"\n");
				array[i][j]=scan.nextInt();
			}
		}
		System.out.println("Array content are\n");
			for(int i=0;i<array.length-1;i++)
			{
				for(int j=0;j<array[i].length;j++)
				{
					System.out.println(array[i][j]+" ");
				}
				System.out.println();
				
			}
	}

}
