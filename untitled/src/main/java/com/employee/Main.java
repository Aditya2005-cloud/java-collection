package com.employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Emp_Name_Salary> emp=new ArrayList<Emp_Name_Salary>();
        emp.add(new Emp_Name_Salary("Smith", 2010));
        emp.add(new Emp_Name_Salary("JOY", 2700));
        emp.add(new Emp_Name_Salary("John", 3000));
        emp.add(new Emp_Name_Salary("Jane", 3200));
        System.out.println("Total salary"+calculateSalary(emp));
    }
    public static int calculateSalary(List<Emp_Name_Salary> emp) {
        int sum=0;
        for(int i=0;i<emp.size();i++){
            sum+=emp.get(i).getSalary();
        }
        return sum;
    }
}
