import java.util.Scanner;

public class array4 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int studentdetails[][] = new int[3][4];
		
		for(int i=0;i<studentdetails.length-1;i++)
		{
			for(int j=0;j<studentdetails[i].length;i++)
			{
				System.out.println("eneter the marks"+i+"student"+j+"\n");
				studentdetails[i][j]=scan.nextInt();
				
			}
		}
		System.out.println("Array content are\n");
		{
			for(int i=0;i<studentdetails.length-1;i++)
			{
				for(int j=0;j<studentdetails[i].length;i++)
				{
					System.out.println(studentdetails[i][j]);
				
				}
			}
		}
	}
}
