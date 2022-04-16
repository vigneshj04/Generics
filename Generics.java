package com.generics;
import java.util.ArrayList;
import java.util.Scanner;

public class Generics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the 3 Numbers to check Maximum ");

        ArrayList<Integer> integers = new ArrayList<>();
        Integer x = scan.nextInt();
        Integer y = scan.nextInt();
        Integer z = scan.nextInt();
        integers.add(x);
        integers.add(y);
        integers.add(z);

        System.out.println(integers);
        maxOfNumber(x,y,z);
    }

    public static <T extends Integer> T maxOfNumber(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println(max);
        return max;
    }
}
