//Exercise 3

import java.util.Scanner;

public class reverseSentence {
    public static void main(String[] args) {
//        Create an original sentence from user input.
        System.out.println("Type a sentence: ");
        Scanner sc = new Scanner(System.in);
        String originalSentence = sc.nextLine();

//        Create an array to store the words from the sentence
        String[] words = originalSentence.split(" ");

//        Create a variable to store the reverse of the sentence.
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
        System.out.println(reversedSentence);
    }
}
