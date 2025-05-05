/*
 * Nama File    : Kucing.java
 * Deskripsi    : Kelas Kucing yang merupakan subclass dari Anabul
 * Pembuat      : Dandy Faishal Fahmi 24060123140136
 * Tanggal      : 01 Mei 2025
*/

public class Kucing extends Anabul {

  // Konstruktor
  public Kucing(String nama, int umur, String jenisKelamin, String warna) {
    super(nama, umur, jenisKelamin, warna);
  }

  // Override metode gerak() dari superclass Anabul
  @Override
  public void gerak() {
    System.out.println(nama + " bergerak dengan melata.");
  }

  // Override metode bersuara() dari superclass Anabul
  @Override
  public void bersuara() {
    System.out.println(nama + " berbunyi: meong!!!");
  }

  // Metode khusus Kucing
  public void scratch() {
    System.out.println(nama + " sedang mencakar.");
  }
}