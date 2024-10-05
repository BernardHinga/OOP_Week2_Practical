//Exercise 3

import java.util.Scanner;

public class reverseSentence {
    public static void main(String[] args) {
//        Create a variable and array to store the words from the sentence
        String originalSentence;
        String[] words;
        
//        Get the original sentence from user input.
//        Make sure user input has at least two words.
        do {
            System.out.println("Type a sentence: ");
            Scanner sc = new Scanner(System.in);
            originalSentence = sc.nextLine();
            
            words = originalSentence.split(" ");
        } while(words.length < 2);


//        Infer the variable that stores the reverse of the sentence from the method.
        String reversedSentence = reverseString(words);

//    Output the reversed sentence.
        System.out.println();
        System.out.println("Original: " + originalSentence);
        System.out.println("Reversed: " + reversedSentence);
    }

//    Create a method with the words array as its parameter to reverse the array, store and return it.
    private static String reverseString(String[] words) {
        String reversedSentence = "";

//        Create a variable that will store the number of words in the sentence.
        int wordCount = words.length;

//        Loop through the sentence indexing each word using the word count as the bounds of the loop.
//        Take into account that arrays count 1integer less than 'natural' counting.
        for (int i = wordCount - 1; i >= 0; i--) {
            reversedSentence += words[i] + " ";
        }

//        Trim possible extra space at the end.
        reversedSentence = reversedSentence.substring(0, reversedSentence.length() - 1);
        return reversedSentence;
    }
}
