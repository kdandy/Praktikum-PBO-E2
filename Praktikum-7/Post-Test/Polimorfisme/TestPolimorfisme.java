package Polimorfisme;

/*Nama File : TestPolimorfisme.java
 * Deskripsi : Berisi program utama untuk memanggil penggunaan fungsi class Pegawai
 * Pembuat : Dandy Faishal Fahmi / 24060123140136
 * Tanggal : Kamis, 24 April 2025
*/

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manager("Joko");
        Pegawai pegawai3 = new Manager("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

// 1. Jelaskan manfaat polimorfisme pada kasus ini 
// Jawab:  Polimorfisme dalam kode ini memungkinkan objek Programmer dan Manajer diperlakukan sebagai objek bertipe Pegawai, sehingga:
// - Objek turunan dapat disimpan dalam satu list (ArrayList<Pegawai> emps) tanpa harus dipisah berdasarkan kelas aslinya
// - Kode menjadi lebih ringkas, fleksibel, dan mudah dikembangkan, karena tidak perlu menggunakan instanceof atau pengecekan tipe secara eksplisit

// 2. Apabila pada main program perlu menambahkan pegawai 4 dan pegawai 5! 
// Apa permasalahan yang muncul jika diterapkan tanpa polimorfisme (inclusion)?
// Jawab: 
// Tidak bisa menggnakan satu list atau array untuk menyimpan berbagai jenis objek 
// karena mereka akan dianggap sebagai tipe yang berbeda.