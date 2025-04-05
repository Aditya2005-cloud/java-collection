package com.employee;

public class Emp_Name_Salary {
    private String Name;
    private int Salary;

    public Emp_Name_Salary(String Name, int Salary) {
        this.Name = Name;
        this.Salary = Salary;
    }
    public String getEmpName() {
        return Name;
    }
    public int getSalary() {
        return Salary;
    }
}
