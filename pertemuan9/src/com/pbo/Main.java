package com.pbo;
import java.util.Scanner;

class ContohArray2 {
    private final int [] angka;
    public ContohArray2(int jmlData) {
        angka = new int[jmlData];
    }
    public void viewAll() {
        System.out.println("View All For");
        for(int i=0;i < this.angka.length; i++) {
            System.out.println("Nilai " + (i+1) + "- " + this.angka[i]);
        }
    }
    public void setAngka() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Data");
        for(int i=0;i<this.angka.length; i++) {
            this.angka[i] = sc.nextInt();
        }
    }

    public void caridata(){
        Scanner sc = new Scanner(System.in);
        if (sc.nextInt() == angka.length){
            System.out.println("Data ketemu");
        }else {
            System.out.println("tidak terdapat data yang dicari");
        }
    }

}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan: ");
        int jmlBil = sc.nextInt();
        ContohArray2 arrA = new ContohArray2(jmlBil);
        arrA.setAngka();
        arrA.viewAll();


        System.out.print("\nmasukan angka yang dicari = ");
        int cari = sc.nextInt();
        ContohArray2 arrA2 = new ContohArray2( cari);
        arrA2.caridata();

    }
}
