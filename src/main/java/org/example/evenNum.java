//Exercise 1
package org.example;

public class evenNum {
    public static void main(String[] args) {
//        Loop specifying the bounds between 0 and 100.
//        Since 0 doesn't count we start from 1.
        for (int i = 1; i <= 100; i++) {
//            Use modulus(even numbers div by 2 rem 0) as a checking parameter.
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}