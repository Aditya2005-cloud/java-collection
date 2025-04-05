package com.example;

import java.util.ArrayList;
import java.util.List;

public class Arr_Lam {
    public static void main(String[] args) {
        call();
    }
    static void call(){
        List<String> lss = new ArrayList<>();
        lss.add("a");
        lss.add("b");
        lss.add("c");
        lss.add("d");
        lss.add("e");
        lss.forEach(word -> System.out.println(word));
    }
}

