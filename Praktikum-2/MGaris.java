/*
 * Nama File : MGaris.java
 * Nama      : Dandy Faishal Fahmi 24060123140136 LAB-E2
 * Deskripsi : Berisi atribut dan method dalam class Garis
 * Tanggal   : 23 Februari 2025
 */

 public class MGaris {
    public static void main(String[] args) {
        Garis garisAwal = new Garis();
        System.out.println("Garis awal adalah:");
        garisAwal.printGaris();
        System.out.println();

        //Menggunakan konstruktor dengan parameter
        Titik Titik1 = new Titik(2, 4);
        Titik Titik2 = new Titik(6, 8);
        Garis Garis1 = new Garis(Titik1, Titik2);
        System.out.println("Garis1: ");
        Garis1.printGaris();
        
        //Menggunakan selektor dan mutator
        Titik Titik3 = new Titik(3, 5);
        Garis1.setTitikAwal(Titik3);
        System.out.println("Garis1 setelah mengubah titik awal T1 menjadi T3:");
        Garis1.printGaris();
        System.out.println();
        
        //Mengetahui jumlah objek garis, panjang garis, dan gradien garis
        System.out.println("Jumlah Objek Garis = " + Garis.getCounterGaris());
        System.out.println("Panjang Garis1: " + Garis1.getPanjang());
        System.out.println("Gradien Garis1: " + Garis1.getGradien());

        //Mendapatkan dan mencetak titik tengah dari Garis1
        Titik TitikTengah = Garis1.getTitikTengah();
        System.out.println("Titik tengah dari Garis1: (" + TitikTengah.getAbsis() + ", " + TitikTengah.getOrdinat() + ")");
        
        //Mengecek apakah garis1 sejajar dengan garisAwal
        System.out.println("Apakah Garis1 sejajar dengan Garis awal? " + Garis1.isSejajar(garisAwal));

        //Mengecek apakah garis1 tegak lurus dengan garisAwal
        System.out.println("Apakah Garis1 tegak lurus dengan Garis awal? " + Garis1.isTegakLurus(garisAwal));

        //Mengetahui persamaan garis dalam bentuk string
        System.out.println("Persamaan Garis1: " + Garis1.getPersamaanGaris());
    }
}