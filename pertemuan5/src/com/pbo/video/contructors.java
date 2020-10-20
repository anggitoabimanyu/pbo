package com.pbo.video;
class Polos{
    String dataString;
    int dataInteger;
}


class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class contructors {
    public static void main(String[] args) throws Exception {

        Mahasiswa mahasiswa1 = new Mahasiswa("Anggito","2018071012","Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Abimanyu","2018071013","Informatika");

        // Polos objectPolos = new Polos();
        // objectPolos.dataString = "polos";
        // objectPolos.dataInteger = 0;

        // System.out.println(objectPolos.dataString);
        // System.out.println(objectPolos.dataInteger);

    }
}
