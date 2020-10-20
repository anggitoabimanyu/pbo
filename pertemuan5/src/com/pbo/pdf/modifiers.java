package com.pbo.pdf;

    abstract class modifiers {
    public String fname = "John";
    public int age = 24;

    public abstract void study();
}

class Student extends modifiers {
    public int graduationYear = 2023;

    public void study() {
        System.out.println("Studying all day long");
    }
}

class MyClass {
    public static void main (String[]args) {
        Student myObj = new Student();
        System.out.println("Name : " + myObj.fname);
        System.out.println("Age : " + myObj.age);
        System.out.println("Graduation Year : " + myObj.graduationYear);
        myObj.study();


    }
}
