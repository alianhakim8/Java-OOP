package com.tutorial;


// class dengan constructor = sesuatu method yang pertama kali saat object dibuat 

class Mahasiswa{
    String nama,NIM,Jurusan;

    // constructor dengan parameter
    Mahasiswa(String inputNama,String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        Jurusan = inputJurusan;

        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + NIM);
        System.out.println("Jurusan\t: " + Jurusan);
        System.out.println("\n");
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Alian","D111911010","Teknik Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Ilyas","D111911011","Teknik Mesin");
    }
}