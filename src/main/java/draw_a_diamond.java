//Exercise 4

import java.util.Scanner;

public class draw_a_diamond {
    public static void main(String[] args) {
//        Get use input for how large the diamond needs to be.
//        One variable is okay since the canvas is a square.
//        Make sure user inputs an odd number greater than 5.
        int diamondSize;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the diamond (preferably an odd number > 5):");
            diamondSize = sc.nextInt();
        } while (diamondSize % 2 == 0 && diamondSize > 5);

//        Get the median of the dimensions (midpoint).
//        This will help in knowing where the diamond reaches its widest point.
        int widthMedian = (diamondSize+1)/2;

//        (#) Is the CANVAS and (" ") is the gap that 'draws' the SHAPE.
        for (int i = -1; i <= diamondSize; i++) {
//        The loop is set out of bounds to account for the first and lass full rows.
//            Draw the first and last full rows.
            if (i < 0 || i == diamondSize) {
                for (int j = 0; j < diamondSize; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
            else {
//            Draw the top half of the diamond.
                if (i < widthMedian - 1) {
//                    Left.
                    for (int j = 0; j < widthMedian - 1 - i; j++) {
                        System.out.print("#");
                    }
//                    Centre.
                    for (int j = 0; j < (2 * i + 1); j++) {
                        System.out.print(" ");
                    }
//                    Right.
                    for (int j = 0; j < widthMedian - 1 - i; j++) {
                        System.out.print("#");
                    }
                    System.out.println();
                }
//            Draw the lower half of the diamond.
                else if (i > widthMedian) {
//                    Left.
                    for (int j = i - widthMedian + 1; j > 0; j--) {
                        System.out.print("#");
                    }
//                    Centre.
                    for (int j = (2 * (diamondSize - i) - 1); j > 0; j--) {
                        System.out.print(" ");
                    }
//                    Right.
                    for (int j = i - widthMedian + 1; j > 0; j--) {
                        System.out.print("#");
                    }
                    System.out.println();
                }
            }

        }
    }
}
