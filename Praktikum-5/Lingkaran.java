/*  Nama File : Lingkaran.java
    Deskripsi : Berisi atribut dan method dalam class Lingkaran yang merupakan turunan dari BangunDatar
    Pembuat   : Dandy Faishal Fahmi 24060123140136
    Tanggal   : 20 Maret 2025
*/

public class Lingkaran extends BangunDatar implements IResize {
  private double jariJari;

  // konstruktor tanpa parameter
  public Lingkaran() {
    // lingkaran memiliki jumlah sisi tak hingga (atau bisa didefinisikan sebagai 1) atau bisa menggunakan nilai khusus seperti 0 untuk menandakan bentuk lingkaran
    setJmlSisi(0);
  }

  // konstruktor dengan parameter jariJari
  public Lingkaran(double jariJari) {
    setJmlSisi(0);
    this.jariJari = jariJari;
  }

  // konstruktor dengan parameter
  public Lingkaran(double diameter, String warna, String border) {
    // memanggil konstruktor BangunDatar
    super(0, warna, border);
    this.jariJari = diameter / 2;
  }

  // getter dan setter jariJari
  public double getJariJari() {
    return jariJari;
  }

  public void setJariJari(double jariJari) {
    this.jariJari = jariJari;
  }

  // method untuk menghitung luas lingkaran
  public double getLuas() {
    return Math.PI * jariJari * jariJari;
  }

  // method untuk menghitung keliling lingkaran
  public double getKeliling() {
    return 2 * Math.PI * jariJari;
  }

  // override method printInfo() dari BangunDatar
  @Override
  public void printInfo() {
    // memanggil printInfo() dari BangunDatar
    super.printInfo();

    // tambahkan informasi jari-jari, luas, dan keliling
    System.out.println("Jari-jari   : " + jariJari);
    System.out.println("Luas        : " + getLuas());
    System.out.println("Keliling    : " + getKeliling());
  }

  // implementasi method dari interface IResize
  @Override
  public void zoomIn() {
    // memperbesar ukuran lingkaran sebesar 10%
    this.jariJari = this.jariJari * 1.1;
  }

  @Override
  public void zoomOut() {
    // memperkecil ukuran lingkaran sebesar 10%
    this.jariJari = this.jariJari * 0.9;
  }

  @Override
  public void zoom(double percent) {
    // mengubah ukuran lingkaran sesuai persentase yang diberikan percent = 100 berarti tidak berubah, 200 berarti 2x lipat, 50 berarti 1/2 kali
    this.jariJari = this.jariJari * (percent / 100);
  }
}
