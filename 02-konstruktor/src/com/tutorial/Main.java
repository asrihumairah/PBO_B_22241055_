package com.tutorial;

class Polos {
     String dataString;
     int dataInteger;

}

class Mahasiswa {
    String nama;
    String Nim;
    String prodi;
    // membuat konstruktor dengan parameter
    Mahasiswa(String inputNama, String inputNim, String inputProdi) {
        nama = inputNama;
        Nim = inputNim;
        prodi = inputProdi;
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + Nim);
        System.out.println("Prodi : " + prodi);
    }
}
public class Main {
    public static void main(String[] args) {
        new Mahasiswa("Asrihumairah", "22241055", "PTI");
    }
}


