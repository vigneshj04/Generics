package com.generics;


public class Generics {
    public static void main(String[] args) {

        MaxOfNumber<Integer> mainFirst = new MaxOfNumber<>(11, 23, 62);
       MaxOfNumber<Float> mainSecond = new MaxOfNumber<>(10.0f, 4.4f, 5.9f);
        MaxOfNumber<String> mainThird = new MaxOfNumber<>("Mango", "JackFruit", "Banana");

        Integer maxInt = mainFirst.maximum();
        Float maxFloat = mainSecond.maximum();
        String maxString = mainThird.maximum();

        System.out.println("maximum integer is: " + maxInt);
        System.out.println("maximum float is: " + maxFloat);
        System.out.println("maximum String is: " + maxString);
    }
}