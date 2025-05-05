/*
 * Nama File    : Datum.java
 * Deskripsi    : Kelas Datum<T> yang merepresentasikan objek generik
 * Pembuat      : Dandy Faishal Fahmi 24060123140136
 * Tanggal      : 01 Mei 2025
*/

public class Datum<T> {
  // Atribut
  private T isi;

  // Konstruktor
  public Datum(T isi) {
    this.isi = isi;
  }

  // Selektor (getter)
  public T getIsi() {
    return isi;
  }

  // Mutator (setter)
  public void setIsi(T isi) {
    this.isi = isi;
  }
}