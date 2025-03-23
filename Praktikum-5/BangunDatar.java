/*  Nama File : BangunDatar.java
    Deskripsi : class abstrak BangunDatar merupakan blueprint untuk objek BangunDatar
    Pembuat   : Dandy Faishal Fahmi 24060123140136
    Tanggal   : 20 Maret 2025
*/

public abstract class BangunDatar {
  protected int jmlSisi;
  protected String warna;
  protected String border;
  private static int counterBangunDatar = 0;

  // konstruktor tanpa parameter
  public BangunDatar() {
    counterBangunDatar++;
  }

  // konstruktor dengan parameter
  public BangunDatar(int jmlSisi, String warna, String border) {
    this.jmlSisi = jmlSisi;
    this.warna = warna;
    this.border = border;
    counterBangunDatar++;
  }

  // abstract methods yang pasti diimplementasikan oleh subclass
  public abstract double getLuas();

  public abstract double getKeliling();

  // method untuk membandingkan luas
  public boolean isEqualLuas(BangunDatar X) {
    return this.getLuas() == X.getLuas();
  }

  // method untuk membandingkan keliling
  public boolean isEqualKeliling(BangunDatar X) {
    return this.getKeliling() == X.getKeliling();
  }

  // method statik untuk menampilkan jumlah objek BangunDatar yang telah dibuat
  public static void printCounterBangunDatar() {
    System.out.println("Jumlah objek BangunDatar yang telah dibuat: " + counterBangunDatar);
  }

  // getter dan setter methods
  public int getJmlSisi() {
    return jmlSisi;
  }

  public void setJmlSisi(int jmlSisi) {
    this.jmlSisi = jmlSisi;
  }

  public String getWarna() {
    return warna;
  }

  public void setWarna(String warna) {
    this.warna = warna;
  }

  public String getBorder() {
    return border;
  }

  public void setBorder(String border) {
    this.border = border;
  }

  // Metode untuk menampilkan informasi
  public void printInfo() {
    System.out.println("Jumlah sisi: " + jmlSisi);
    System.out.println("Warna: " + warna);
    System.out.println("Border: " + border);
  }
}

/*
 * JAWABAN PERTANYAAN PRAKTIKUM ABSTRACT CLASS:
 * 
 * 1. Apakah method isEqualLuas() dan isEqualKeliling() dapat digunakan untuk
 * membandingkan objek bangun datar yang berbeda?
 * 
 * Betul, method tersebut dapat digunakan untuk membandingkan objek bangun datar
 * yang berbeda. Ini dimungkinkan karena polymorphism - meskipun objeknya
 * berbeda (Persegi, Lingkaran), keduanya merupakan subclass dari BangunDatar
 * dan memiliki implementasi getLuas() dan getKeliling() masing-masing.
 * 
 * 2. Jika BangunDatar tidak dijadikan sebagai abstract class, dapatkah membuat
 * method isEqualLuas() dan isEqualKeliling()?
 * 
 * Secara teknis bisa, tetapi akan bermasalah karena:
 * - Kita harus menyediakan implementasi default untuk getLuas() dan
 * getKeliling() di class BangunDatar yang tidak masuk akal
 * - Tidak ada cara umum untuk menghitung luas dan keliling bangun datar tanpa
 * mengetahui bentuk spesifiknya
 * - Kita juga bisa membuat objek BangunDatar langsung yang tidak memiliki
 * bentuk spesifik
 * 
 * 3. Apa kelebihan class BangunDatar dijadikan abstract class?
 * 
 * - Memastikan setiap subclass mengimplementasikan getLuas() dan getKeliling()
 * - Mencegah instantiasi objek BangunDatar secara langsung (karena bangun datar
 * umum tidak memiliki bentuk spesifik)
 * - Memberikan kerangka kerja yang konsisten untuk semua tipe bangun datar
 * - Mendukung polymorphism yang memungkinkan operasi umum pada berbagai bentuk
 * spesifik melalui abstract methods
 * - Desain yang lebih bersih dengan pemisahan antara interface (apa yang harus
 * dilakukan) dan implementation (bagaimana melakukannya)
 */
