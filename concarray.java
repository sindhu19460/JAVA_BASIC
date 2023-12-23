public class concarray {
	public static void mian(String args[])
	{
		System.out.println("Array\n");
		// first array 
        int[] a = { 10, 20, 30, 40 }; 
  
        // second array 
        int[] b = { 50, 60, 70, 80 }; 
        
        int a_len = a.length;
        int b_len = b.length;
        
        System.out.println("array length of a="+a_len+"\n");
        System.out.println("array length of b="+b_len+"\n");
        
        System.out.println("Adding both a nd b length in c_len varaible\n");
        int c_len = a_len + b_len;
        
        int[] c = new int[c_len];
        System.out.println("array length of a="+c.length+"\n");
        
        for(int i=0;i<=a.length;i++)
        {
        	c[i]=a[i];
        }
        
        for(int i=0;i<=b.length;i++)
        {
        	c[i]=b[i];
        }
        
        for(int i=0;i<=c.length;i++)
        {
        	System.out.println(c[i]);
        }
	}	
}

