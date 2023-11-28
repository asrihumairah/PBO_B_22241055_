package com.tutorial;

class Mahasiswa{
    // Data Member
    String nama;
    String nim;
    String prodi;

    // konstruktor
    Mahasiswa(String nama, String nim, String prodi){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;

    }   
    // method tanpa return dan tanpa parameter
    void show(){
        System.out.println("nama : " + this.nama);
        System.out.println("nim : " + this.nim);
        System.out.println("prodi : " + this.prodi);

    }
    // method tanpa dengan parameter
    void setnama(String nama, String nim, String prodi){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }


        // method tanpa parameter dengan return
        String getnama(){
            return this.nama;
        }
        String getnim(){
            return this.nim;
        }
        // metod dengan parameter dengan return
        String sayHi(String pesan) {
            return pesan + "aku " + this.nama + "Mahasiswa PTI"; 
        
        }

    
        
    

}
    


public class Main {
    public static void main(String[] args) {
        // membuatobjek baru atau instansiasi
        Mahasiswa mhs1 = new Mahasiswa("Asri", "22241055", "PTI");
    
        // memanggil method
        mhs1.show();
        mhs1.setnama("aii","260423", "ipa");
        mhs1.show();
            

        System.out.println(mhs1.getnama());
        System.out.println(mhs1.getnim());

        String pesan = mhs1.sayHi("Hallo");
        System.out.println(pesan);
    }
}


