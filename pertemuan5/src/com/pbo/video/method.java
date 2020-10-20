package com.pbo.video;
class Mahasiswau{
    // Data member
    String nama;
    String NIM;

    // constructor
    Mahasiswau(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    // method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }

    // method tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    // method dengan return tapi tidak ada parameter
    String getNama(){
        return this.nama;
    }

    String getNIM(){
        return this.NIM;
    }

    // method dengan return dan dengan parameter
    String sayHi(String message){
        return message + " juga, nama saya adalah " + this.nama;
    }
}

public class method{
    public static void main(String[] args) {
        Mahasiswau mahasiswa1 = new Mahasiswau("Anggito","2018071012");
        // method
        mahasiswa1.show();
        mahasiswa1.setNama("anggito");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("keren");
        System.out.println(data);
    }
}
