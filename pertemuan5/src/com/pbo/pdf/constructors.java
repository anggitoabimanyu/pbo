package com.pbo.pdf;

public class constructors {
    int modelYear;
    String modelName;

    public constructors(int year, String name){
        modelYear = year;
        modelName = name;
    }

    public static void main(String[]args){
        constructors myCar = new constructors(1969, "mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}

