package com.generics;

public class MaxOfNumber<E extends Comparable<E>> {

    E x, y, z;

    public MaxOfNumber(E x, E y, E z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    <E> E maximum(){
        return (E)maximum(this.x,this.y,this.z);
    }

    public  <E extends Comparable <E>> E maximum(E x, E y, E z) {
        E max = x;
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
