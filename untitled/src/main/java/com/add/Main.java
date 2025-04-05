package com.add;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        List<Integer> no= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            no.add(arr[i]);
        }
        //System.out.println(no);
        System.out.println("the sum is "+add(no));
    }
    public static int add(List<Integer> list){
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }

        return sum;
    }

}
