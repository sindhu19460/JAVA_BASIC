	package string;
	
	public class SIparseint {
		public static void main(String [] args)
		{
			String s1 = "2022";
			
			int i = Integer.parseInt(s1);
			System.out.println("String to int="+i);
			
			int i2 = Integer.valueOf(s1);
			System.out.println("String to int="+i2);
		}
	
	}
