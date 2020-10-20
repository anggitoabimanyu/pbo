package com.pbo.video;

class Mahasiswaa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}


public class pengenalan {
    public static void main(String[] args) throws Exception {

        Mahasiswaa mahasiswa1 = new Mahasiswaa();
        mahasiswa1.nama = "Anggito";
        mahasiswa1.NIM = "2018071012";
        mahasiswa1.jurusan = "Informatika";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 20;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        Mahasiswaa mahasiswa2 = new Mahasiswaa();
        mahasiswa2.nama = "Abimanyu";
        mahasiswa2.NIM = "2018071013";
        mahasiswa2.jurusan = "Informatika";
        mahasiswa2.IPK = 3.5;
        mahasiswa2.umur = 22;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }
}
