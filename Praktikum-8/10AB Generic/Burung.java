/*
 * Nama File    : Burung.java
 * Deskripsi    : Kelas Burung yang merupakan subclass dari Anabul
 * Pembuat      : Dandy Faishal Fahmi 24060123140136
 * Tanggal      : 01 Mei 2025
*/

public class Burung extends Anabul {

  // Konstruktor
  public Burung(String nama, int umur, String jenisKelamin, String warna) {
    super(nama, umur, jenisKelamin, warna);
  }

  // Override metode gerak() dari superclass Anabul
  @Override
  public void gerak() {
    System.out.println(nama + " bergerak dengan terbang efisien.");
  }

  // Override metode bersuara() dari superclass Anabul
  @Override
  public void bersuara() {
    System.out.println(nama + " berbunyi: cuit!!!");
  }

  // Metode khusus Burung
  public void terbangTinggi() {
    System.out.println(nama + " sedang terbang tinggi ke atas awan.");
  }
}
