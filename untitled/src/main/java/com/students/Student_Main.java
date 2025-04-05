package com.students;

import java.util.ArrayList;
import java.util.List;

public class Student_Main {
    public static void main(String[] args)
    {
        List<Student> s = new ArrayList<>();
        s.add(new Student("A", "BTech"));
        s.add(new Student("B", "BCA"));
        s.add(new Student("C", "BTech"));
        for (int i=0;i<s.size();i++)
        {
            Student ss=s.get(i);
            if(ss.getDegree().equals("BTech")){
                System.out.println("Name: "+ss.getName()+" , Degree: "+ss.getDegree());
            }
        }
    }
}
