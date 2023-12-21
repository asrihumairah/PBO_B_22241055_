package com.tutorial;

class Karyawan {
    private String nama;
    private String jabatan;
    private double pajak;
    private double gajiPokok;
    private double gajiBersih;

    public Karyawan(String nama, String jabatan, double gajiPokok) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.pajak = 0.1;
        this.gajiPokok = gajiPokok;
        hitungGajiBersih();
    }

    public double getGajiBersih() {
        return gajiBersih;
    }

    private void setGajiBersih(double gajiBersih) {
        this.gajiBersih = gajiBersih;
    }

    private void hitungGajiBersih() {
        setGajiBersih(gajiPokok - (gajiPokok * pajak));
    }

    public static void main(String[] args) {
        double gajiPokok = 3500000;
        Karyawan karyawan1 = new Karyawan("Adam", "Dosen", gajiPokok);

        System.out.println("Nama: " + karyawan1.nama);
        System.out.println("Jabatan: " + karyawan1.jabatan);
        System.out.println("Gaji Pokok: " + karyawan1.gajiPokok);
        System.out.println("Pajak: " + karyawan1.pajak);
        System.out.println("Gaji Bersih: " + karyawan1.getGajiBersih());
    }


 }


