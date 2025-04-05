package com.example;

import java.util.ArrayList;
import java.util.List;

public class Arr_Greater_3 {
    public static void main(String[] args) {
        call();
    }
    static void call(){
        List<String> l = new ArrayList<>();
        l.add("apple");
        l.add("b");
        l.add("cats");
        l.add("dogs");
        l.add("e");
        for (String i: l) {
            if(i.length()>3){
                System.out.println(i);
            }
        }
    }
}
