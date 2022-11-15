package com.example.helloworld;

import java.util.Arrays;

public class HomeworkArrays {
    public static void main(String[] args) {
        arrayTask1();
    }
    static void arrayTask1(){
        String[] names = {"Mike", "John", "Lis", "Elisabet"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
