import java.util.Arrays;

public class sortTwoarray {
	public static void main(String args[])
	{
		int array[][]= {{3,2,1},{4,2,1},{1,2,3}};
		
		
		Arrays.sort(array,(a,b) ->{
			for (int i=0;i<a.length;i++)
			{
				if(a[i] != b[i])
				{
					return a[i]-b[i];
				}
			}
			return 0;
		});
	}

}
