package com.examples.S01Springcoreapp;


public class App 
{
    public static void main( String[] args )
    {
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("Tom");
        
        System.out.println(emp.toString());
    }
}
