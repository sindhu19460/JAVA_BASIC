package string;

public class concmultistring {
	public static void main(String[] args)
	{
		String [] arr1 = {"Hello","World"};
		String [] arr2 = {"!"};
		
		String [] arr3 = new String[arr1.length+arr2.length];
		System.out.println("Arrray 3 length="+arr3.length);
		
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			arr3[arr1.length+1]=arr2[i];
		}
		
		System.out.println(arr3);
	}

}
