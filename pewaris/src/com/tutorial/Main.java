package com.tutorial;

class hero{
    String nama;

    void display(){
        System.out.println("nama Hero : " + nama);
    }
}

class herotank extends hero{
    float health;

    void display(){
        System.out.println("healt : " + nama);
    }
}



public class Main {
    public static void main(String[] args) {
        hero hero_1 = new hero();
        hero_1.nama = "Asri";
        hero_1.display();

        herotank hero_2 = new herotank();
        hero_2.nama = "mia";
        hero_2.display();
   
    }
}
