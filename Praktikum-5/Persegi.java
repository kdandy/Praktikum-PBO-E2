/*  Nama File : Persegi.java
    Deskripsi : Berisi atribut dan method dalam class Persegi yang merupakan turunan dari BangunDatar
    Pembuat   : Dandy Faishal Fahmi 24060123140136
    Tanggal   : 20 Maret 2025
*/

public class Persegi extends BangunDatar implements IResize {
  private double sisi;

  // konstruktor tanpa parameter
  public Persegi() {
    // karena persegi memiliki 4 sisi, kita set nilai jmlSisi di sini
    setJmlSisi(4);
  }

  // konstruktor dengan parameter sisi
  public Persegi(double sisi) {
    setJmlSisi(4);
    this.sisi = sisi;
  }

  // konstruktor dengan parameter penerapan super()
  public Persegi(double sisi, String warna, String border) {
    this.jmlSisi = 4;
    this.warna = warna;
    this.border = border;
    this.sisi = sisi;
  }

  // getter dan Setter sisi
  public double getSisi() {
    return sisi;
  }

  public void setSisi(double sisi) {
    this.sisi = sisi;
  }

  // method untuk menghitung luas
  public double getLuas() {
    return sisi * sisi;
  }

  // method untuk menghitung keliling
  public double getKeliling() {
    return 4 * sisi;
  }

  // method untuk menghitung diagonal
  public double getDiagonal() {
    return Math.sqrt(2) * sisi;
  }

  // override method printInfo() dari BangunDatar
  @Override
  public void printInfo() {
    // memanggil printInfo() dari BangunDatar untuk menampilkan jmlSisi, warna, dan border
    super.printInfo();

    // tambahkan informasi sisi, luas, dan keliling
    System.out.println("Sisi        : " + sisi);
    System.out.println("Luas        : " + getLuas());
    System.out.println("Keliling    : " + getKeliling());
  }

  // implementasi method dari interface IResize
  @Override
  public void zoomIn() {
    // memperbesar ukuran persegi sebesar 10%
    this.sisi = this.sisi * 1.1;
  }

  @Override
  public void zoomOut() {
    // memperkecil ukuran persegi sebesar 10%
    this.sisi = this.sisi * 0.9;
  }

  @Override
  public void zoom(double percent) {
    // Mengubah ukuran persegi sesuai persentase yang diberikan percent = 100 berarti tidak berubah, 200 berarti 2x lipat, 50 berarti 1/2 kali
    this.sisi = this.sisi * (percent / 100);
  }

  public static void printCounterBangunDatar() {
    System.out.println("Ini dari kelas Persegi");
  }
}
