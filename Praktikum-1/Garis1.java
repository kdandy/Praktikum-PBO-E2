/*
 * Nama File : Garis.java
 * Nama      : Dandy Faishal Fahmi 24060123140136 LAB-E2
 * Deskripsi : Berisi atribut dan method dalam class Garis
 * Tanggal   : 23 Februari 2025
 */

public class Garis1 {
    // ATRIBUT //
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;
  
    // METHOD //
    // Konstruktor tanpa parameter, menetapkan titik awal (0,0) dan titik akhir (1,1)
    Garis1() {
      titikAwal = new Titik();
      titikAkhir = new Titik(1, 1);
      counterGaris++;
    }
  
    // Konstruktor dengan parameter untuk titik awal dan titik akhir
    Garis1(Titik titikAwal, Titik titikAkhir) {
      this.titikAwal = titikAwal;
      this.titikAkhir = titikAkhir;
      counterGaris++;
    }

  // untuk mendapatkan titik awal
    Titik getTitikAwal() { 
      return titikAwal;
    }

  // untuk mendapatkan titik akhir
    Titik getTitikAkhir() { 
      return titikAkhir;
    }

  // untuk mengeset titik awal
    void setTitikAwal(Titik titikAwal) { 
      this.titikAwal = titikAwal;
    }

  // untuk mengeset titik akhir
    void setTitikAkhir(Titik titikAkhir) { 
      this.titikAkhir = titikAkhir;
    }

  // untuk mendapatkan counterGaris
    static int getCounterGaris() { 
      return counterGaris;
    }
  
    // untuk mendapatkan panjang sebuah garis
    double getPanjang() {
      return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2)
          + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }
  
    // untuk mendapatkan gradien dari sebuah garis
    double getGradien() {
      return (titikAkhir.getOrdinat() - titikAwal.getOrdinat())
          / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }
  
    // untuk mendapatkan titik tengah dari sebuah garis
    Titik getTitikTengah() {
      double absisTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
      double ordinatTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
      return new Titik(absisTengah, ordinatTengah);
    }
  
    // untuk mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya, mengembalikan true jika sejajar dan false jika sebaliknya.
    boolean isSejajar(Garis garis) {
      return this.getGradien() == garis.getGradien();
    }
  
    // untuk mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya, mengembalikan true jika sejajar dan false jika sebaliknya.
    boolean isTegakLurus(Garis garis) {
      return this.getGradien() * garis.getGradien() == -1;
    }
  
    // untuk menampilkan ke layar titik awal dan titik akhir garis.
    void printGaris() {
      System.out.println("Titik awal: ");
      titikAwal.printTitik();
      System.out.println("Titik akhir: ");
      titikAkhir.printTitik();
    }
  
    // untuk menampilkan persamaan garis dalam bentuk string y = mx + c.
    // Contoh: garis yang dibuat dari titik (-2,0) dan (0,4) mempunyai persamaan garis y = 2x + 4.
    void printPersamaanGaris() {
      double m = this.getGradien();
      double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
      System.out.println("y = " + m + "x + " + c);
    }
  }
  