package com.tutorial;

class Pegawai {
    protected String nama;
    protected double gajiPokok;
    protected double tunjangan;
    protected double durasiLembur;

    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.tunjangan = 0;
        this.durasiLembur = 0;
    }

    public void setTunjangan(double persenTunjangan) {
        this.tunjangan = gajiPokok * (persenTunjangan / 100);
    }

    public void setDurasiLembur(double durasi) {
        this.durasiLembur = durasi;
    }

    public double getGajiBersih() {
        return gajiPokok + tunjangan + (durasiLembur * (0.10 * gajiPokok));
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Durasi Lembur: " + durasiLembur);
        System.out.println("Gaji Bersih: " + getGajiBersih());
        System.out.println("--------------------------");
    }
}
//Subb clas
class PegawaiTetap extends Pegawai {
    public PegawaiTetap(String nama, double gajiPokok) {
        super(nama, gajiPokok);
    }

    @Override
    public double getGajiBersih() {
        return gajiPokok + tunjangan + (durasiLembur * (0.10 * gajiPokok));
    }
}

class PegawaiTidakTetap extends Pegawai {
    public PegawaiTidakTetap(String nama, double gajiPokok) {
        super(nama, gajiPokok);
    }

    @Override
    public double getGajiBersih() {
        return gajiPokok + (durasiLembur * (0.05 * gajiPokok));
    }
}

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai1 = new PegawaiTetap("asrihumairah", 500000);
        Pegawai pegawai2 = new PegawaiTidakTetap("airaa", 300000);

        pegawai1.setTunjangan(70);
        pegawai1.setDurasiLembur(10);

        pegawai2.setDurasiLembur(8);
        pegawai1.tampilkanInfo();
        pegawai2.tampilkanInfo();
    }
}