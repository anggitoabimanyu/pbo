package com.pbo;



class car {
    String merk;

}


public class oop {
    public static void main(String[] args) throws Exception {


        car car1 = new car();
        car1.merk = "Volvo";

        System.out.println(car1.merk);

        car car2 = new car();
        car2.merk = "Audi";

        System.out.println(car2.merk);

        car car3 = new car();
        car3.merk = "Toyota";

        System.out.println(car3.merk);
    }
}