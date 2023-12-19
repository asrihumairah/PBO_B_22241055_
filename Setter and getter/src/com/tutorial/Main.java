package com.tutorial;

class User{
    // Date member keyword private
    private String username;
    private String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

        // method Getter 
        public String getusername() {
            return this.username;

        }
            public String getpassword(){
                return this.password;
            }
                // Method setter unutk ganti password
                public void setpassword(String password){
                    this.password = password;
                }
                 }
                
public class Main {
    public static void main(String[] args) {
        //instansiasi pembuatan objek 
        User person_1 = new User ("UNDIKMA", "JAYA JAYA JAYA");

        // get username
        System.out.println(person_1.getusername());
        System.out.println(person_1.getusername());
        person_1.setpassword("sukses");
        System.out.println("password baru"+ person_1.getpassword());
    }
}
