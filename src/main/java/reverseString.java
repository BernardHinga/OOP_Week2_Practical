//Exercise 2

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
//        Initiate the original string with user input.
        System.out.println("Type a word: ");
        Scanner sc = new Scanner(System.in);
        String originalString = sc.nextLine();

//        Variable to store the reverse string.
        String reversedString = "";

//        Initialize the for loop with the length of the string(-1 to ensure loop isn't out of bounds).
        for (int i = originalString.length() - 1; i >= 0 ; i--) {
//            Concatenate each character into the reversed string.
            reversedString += originalString.charAt(i);
        }

        System.out.println("Original word: " + originalString + "\nReversed word: " + reversedString);
    }
}
