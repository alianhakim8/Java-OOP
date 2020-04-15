package com.tutorial;

class Mahasiswa{

    // Data Member
        String nama,NIM;

    // constructor

        Mahasiswa(String nama,String NIM){
            this.nama = nama;
            this.NIM = NIM;

        }

    // 1. method tanpa return dan tanpa parameter
    // contoh 

        void show(){
            System.out.println("Nama\t: " + this.nama);
            System.out.println("NIM\t: " + this.NIM);
        }

    // 2. method tanpa return dengan parameter
    // contoh 

        void setNama(String nama){
            this.nama = nama;
        }

    // 3. method dengan return tanpa parameter
    // contoh 

        String getNama(){
            return this.nama;
        }

        String getNIM(){
            return this.NIM;
        }

    // 4. method dengan return dan paramater

        String Sapa(String ucapin){

            return ucapin + " juga, " + " nama saya adalah " + this.nama;
        }

}


class Dosen{
    String nama;

    Dosen(String nama){
        this.nama = nama;
    }
}

public class Main{
    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa("Alian","D1119110");

        // method

        mahasiswa1.show();
        mahasiswa1.setNama("Ilyas");
        mahasiswa1.show();
        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());
        System.out.println();

        String data = mahasiswa1.Sapa("Halo");
        System.out.println(data);

        Dosen dosen1 = new Dosen("Ilyas");
    }


 
}