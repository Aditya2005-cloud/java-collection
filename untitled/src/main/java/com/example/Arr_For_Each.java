package com.example;

import java.util.ArrayList;
import java.util.List;

public class Arr_For_Each {
    public static void main(String[] args) {
        call();
    }
    static void call(){
        List<String> ls = new ArrayList<>();
        ls.add("a");
        ls.add("b");
        ls.add("c");
        ls.add("d");
        ls.add("e");
        for (String i: ls) {
            System.out.println(i);
        }
    }
}
