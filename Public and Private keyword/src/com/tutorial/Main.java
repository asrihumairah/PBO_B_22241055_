package com.tutorial;
 
class player {
    // data member 
    String name; //default,bisa diakses oleh celass lain
    public int exp; // public, bisa diakses oleh class lain
    private int health; // private, tidak bisa diakses oleh class lain
    
    player (String nama, int exp, int healt) {
        this. name = name;
        this. exp = exp;
        this. health = healt;

         }
         void Display(){ 
            System.out.println("Nama player : " + this.name);
            System.out.println("Nama EXP : " + this.exp);
            System.out.println("Player health : "+ this. health);
         }
    
    

    
}
public class Main {
    public static void main(String[] args) {
        // instansiasi atau pembuatan objek baru 
        player hero_1 = new player ( "asri", 
        20, 100);

        hero_1.Display();
        

    }
}
