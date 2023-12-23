//36.	How do you convert a one-dimensional array to a two-dimensional array in Java
public class oneDtoTwoD {
	    public static void main(String[] args) {
	        int[] oneDimensionalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int[][] twoDimensionalArray = new int[4][4];

	        for (int i = 0; i < oneDimensionalArray.length; i++) {
	            int row = i / 3;
	            int column = i % 3;
	            twoDimensionalArray[row][column] = oneDimensionalArray[i];
	        }

	        for (int i = 0; i < twoDimensionalArray.length; i++) {
	            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
	                System.out.print(twoDimensionalArray[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}