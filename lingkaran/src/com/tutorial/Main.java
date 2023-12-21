package com.tutorial;

class Lingkaran {
    float r;
    float diameter;

    public Lingkaran (float r, float diameter) {
        this.r = r;
        this.diameter=diameter;
    }

    void display() {
        float luas = (float)(Math.PI*r*r);
        float keliling = (float) (2*3.14*r);
        System.out.println("Keliling lingkaran " + luas);
        System.out.println("Luas Lingkaran " + keliling);
    }

    }

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(10, 30);
        System.out.println("Jari-jari : " + lingkaran.r);
        System.out.println("Diameter : " + lingkaran.diameter);
        lingkaran.display();
    }
}

