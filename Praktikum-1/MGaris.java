/*
 * Nama File : MGaris.java
 * Nama      : Dandy Faishal Fahmi 24060123140136 LAB-E2
 * Deskripsi : Berisi atribut dan method dalam class Garis
 * Tanggal   : 23 Februari 2025
 */

public class MGaris {
    public static void main(String[] args) {
      System.out.println("==============================");
      System.out.println("   Pengujian Objek Garis   ");
      System.out.println("==============================\n");
  

      // UJI //
      // konstruktor
      System.out.println("pengujian Konstruktor");
      Garis g1 = new Garis();
      System.out.println("garis g1:");
      g1.printGaris();
      System.out.println("panjang g1: " + g1.getPanjang());
      System.out.println("gradien g1: " + g1.getGradien());
      System.out.print("titik tengah g1: ");
      g1.getTitikTengah().printTitik();
      System.out.println();
  
      // konstruktor dengan parameter
      System.out.println("pengujian Konstruktor dengan parameter");
      Titik t1 = new Titik(2, 3);
      Titik t2 = new Titik(8, 11);
      Garis g2 = new Garis(t1, t2);
      System.out.println("garis g2:");
      g2.printGaris();
      System.out.println("panjang g2: " + g2.getPanjang());
      System.out.println("gradien g2: " + g2.getGradien());
      System.out.print("titik tengah g2: ");
      g2.getTitikTengah().printTitik();
      System.out.println();
  
      // fungsi isSejajar
      System.out.println("pengujian isSejajar *kasus salah");
      // garis dengan gradien berbeda
      Garis g3 = new Garis(new Titik(0, 0), new Titik(6, 10));
      System.out.println("garis g2 dan g3 sejajar? " + g2.isSejajar(g3));
      System.out.println();
  
      System.out.println("uji isSejajar *kasus benar");
      // membuat dua garis dengan gradien yang sama (misal, slope = 1)
      Garis g5 = new Garis(new Titik(0, 0), new Titik(2, 2));
      Garis g6 = new Garis(new Titik(1, 1), new Titik(3, 3));
      System.out.println("garis g5 dan g6 sejajar? " + g5.isSejajar(g6));
      System.out.println();
  
      // fungsi isTegakLurus
      System.out.println("uji isTegakLurus *kasus salah");
      // garis dengan gradien yang bukan négatif resiprokal
      Garis g4 = new Garis(new Titik(0, 0), new Titik(6, -8));
      System.out.println("garis g2 dan g4 tegak lurus? " + g2.isTegakLurus(g4));
      System.out.println();
  
      System.out.println("uji isTegakLurus *kasus benar");
      // membuat dua garis dengan gradien yang saling negatif resiprokal
      Garis g7 = new Garis(new Titik(0, 0), new Titik(2, 2));
      Garis g8 = new Garis(new Titik(0, 0), new Titik(2, -2));
      System.out.println("garis g7 dan g8 tegak lurus? " + g7.isTegakLurus(g8));
      System.out.println();
  
      // print Persamaan Garis
      System.out.println("print persamaan garis");
      System.out.print("persamaan garis g2: ");
      g2.printPersamaanGaris();
      System.out.println();
  
      // contoh: garis yang dibuat dari titik (-2,0) dan (0,4) mempunyai persamaan y = 2x + 4.
      Titik a = new Titik(-2, 0);
      Titik b = new Titik(0, 4);
      Garis gEx = new Garis(a, b);
      System.out.print("persamaan garis dari titik (-2,0) dan (0,4): ");
      gEx.printPersamaanGaris();
      System.out.println();
  
      // tampilkan jumlah objek Garis yang dibuat (menggunakan counterGaris)
      System.out.println("jumlah objek garis yang telah dibuat: " + Garis.getCounterGaris());
    }
  }
  