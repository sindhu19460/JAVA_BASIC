// Import the Arrays class from the java.util package.
import java.util.Arrays;
import java.util.Scanner;

// Define a class named Exercise7.
public class removearray {
 
    // The main method where the program execution starts.
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
        // Declare and initialize an integer array 'my_array'.
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Original array="+Arrays.toString(my_array));
        
        System.out.println("Remove index value\n");
        int removeindex = scan.nextInt();
        
        for(int i=removeindex;i<my_array.length-1;i++)
        {
        	my_array[i]=my_array[i+1];
        }
        
        System.out.println("after removing"+Arrays.toString(my_array));
    }
}