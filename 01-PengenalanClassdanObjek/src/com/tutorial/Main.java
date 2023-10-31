package com.tutorial;
class Mahasiswa {
    String Nama;
    String NIM;
    String Prodi;
}
public class Main {
    public static void main(String[] args) {
        Mahasiswa MHS1 = new Mahasiswa();
        MHS1.Nama = "Asri";
        MHS1.NIM = "22241055";
        MHS1.Prodi = "PTI";
        System.out.println("Nama : " + MHS1.Nama);
        System.out.println("NIM : " + MHS1.NIM);
        System.out.println("Prodi : " + MHS1.Prodi);

        Mahasiswa MHS2 = new Mahasiswa();
        MHS2.Nama = "Humairah";
        MHS2.NIM = "22241065";
        MHS2.Prodi = "Inggirs";
        System.out.println("Nama : " + MHS2.Nama);
        System.out.println("NIM : " + MHS2.NIM);
        System.out.println("Prodi : " + MHS2.Prodi);
    }
}
