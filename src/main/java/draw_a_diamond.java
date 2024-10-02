import java.util.Scanner;

public class draw_a_diamond {
    public static void main(String[] args) {
//        Get use input for how wide the diamond needs to be
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the diamond:");
        int diamondWidth = sc.nextInt();

//        Get the median of the width. It will be the initializer or conditional in the loops.
//        If the width is odd, add 1 to the median.
        int widthMedian = diamondWidth/2;
        
//        (#) Is the CANVAS and (" ") is the gap that 'draws' the SHAPE
//        Draw the top half.
        for (int i = widthMedian; i >= 1; i--) {
            for (int x = 0; x < i; x++) {
                System.out.print("#");
            }

//            The gap that forms the diamond shape
            for (int y = i; y < widthMedian; y++) {
                System.out.print(" ");
            }

//            Print out the top-right side of the canvas.
            for (int z = 0; z < i; z++) {
                System.out.print("#");
            }
            System.out.println();
        }

//        Draw the bottom half.
        for (int i = 1; i <= widthMedian; i++) {
            {
                int y = 0;
                while (y < i) {
                    System.out.print("#");
                    y++;
                }
            }
//            The gap that forms the diamond shape
            for (int z = i; z < widthMedian; z++) {
                System.out.print(" ");
            }

            for (int y = 0; y < i; y++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
