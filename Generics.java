package com.generics;
import java.util.ArrayList;
import java.util.Scanner;

public class Generics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the 3 Words to Check Maximum ");

        ArrayList<String> string = new ArrayList<>();
        String x = scan.next();
        String y = scan.next();
        String z = scan.next();
        string.add(x);
        string.add(y);
        string.add(z);

        System.out.println(string);
        maxOfNumber(x,y,z);
    }

    public static <T extends String> T maxOfNumber(T x, T y, T z) {
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
