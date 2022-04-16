package com.generics;
import java.util.ArrayList;
import java.util.Scanner;

public class Generics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the 3 Numbers to check Maximum ");

        ArrayList<Float> floats = new ArrayList<>();
        Float x = scan.nextFloat();
        Float y = scan.nextFloat();
        Float z = scan.nextFloat();
        floats.add(x);
        floats.add(y);
        floats.add(z);

        System.out.println(floats);
        maxOfNumber(x,y,z);
    }

    public static <T extends Float> T maxOfNumber(T x, T y, T z) {
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
