package string;

import java.util.Arrays;

public class countword {

    public static void main(String[] args) {
        String string = "This is a sentence with 5 words";
        String[] words = string.split(" ");
        int wordCount = words.length;
        System.out.println("The number of words in the string is: " + wordCount);
    }
}