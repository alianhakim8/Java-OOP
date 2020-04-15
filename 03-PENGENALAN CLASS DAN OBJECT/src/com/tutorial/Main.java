package com.tutorial;

// membuat class sebagai template
class Mahasiswa{
    String nama,NIM,jurusan;
    double IPK;
    int umur;
}


public class Main {
    public static void main(String[] args) throws Exception{
        
        // instansiasi class / membuat objek
        Mahasiswa mahasiswa1 = new Mahasiswa();
        

        mahasiswa1.nama = "Alian Hakim";
        mahasiswa1.NIM = "D111911010";
        mahasiswa1.jurusan = "Teknik Informatika";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 19;

        System.out.println("Nama : " + mahasiswa1.nama);
        System.out.println("NIM : " + mahasiswa1.NIM);
        System.out.println("Jurusan : " + mahasiswa1.jurusan);
        System.out.println("IPK : " + mahasiswa1.IPK);
        System.out.println("Umur : " + mahasiswa1.umur);
        System.out.println("\n");
        Mahasiswa mahasiswa2 = new Mahasiswa();
        

        mahasiswa2.nama = "Ilyas Yasin";
        mahasiswa2.NIM = "D111911011";
        mahasiswa2.jurusan = "Teknik Mesin";
        mahasiswa2.IPK = 4.0;
        mahasiswa2.umur = 20;

        System.out.println("Nama : " + mahasiswa2.nama);
        System.out.println("NIM : " + mahasiswa2.NIM);
        System.out.println("Jurusan : " + mahasiswa2.jurusan);
        System.out.println("IPK : " + mahasiswa2.IPK);
        System.out.println("Umur : " + mahasiswa2.umur);
       
    }
}