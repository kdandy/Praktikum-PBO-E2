/*
 * Nama File : Garis.java
 * Nama      : Dandy Faishal Fahmi 24060123140136 LAB-E2
 * Deskripsi : Berisi atribut dan method dalam class Garis
 * Tanggal   : 23 Februari 2025
 */

public class Garis {
    /****************ATRIBUT*****************/
    private Titik TitikAwal;
    private Titik TitikAkhir;
    private static int counterGaris = 0;

    /****************METHOD*****************/
    //Konstruktor tanpa parameter yang menginisialisasi titik awal dengan (0,0) dan titik akhir dengan (1,1)
    public Garis() {
        this.TitikAwal = new Titik(0, 0);
        this.TitikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    //Konstruktor dengan parameter untuk membuat garis dengan titik awal dan akhir
    public Garis(Titik TitikAwal, Titik TitikAkhir) {
        this.TitikAwal = TitikAwal;
        this.TitikAkhir = TitikAkhir;
        counterGaris++;
    }

    //Selector mengembalikan titik awal
    public Titik getTitikAwal() {
        return TitikAwal;
    }

    //Selector mengembalikan titik akhir
    public Titik getTitikAkhir() {
        return TitikAkhir;
    }

    //Selector mengembalikan nilai banyaknya garis
    public static int getCounterGaris() {
        return counterGaris;
    }

    //Mengeset titik awal untuk garis dengan nilai baru
    public void setTitikAwal(Titik TitikAwal) {
        this.TitikAwal = TitikAwal;
    }

    //Mengeset titik akhir untuk garis dengan nilai baru
    public void setTitikAkhir(Titik TitikAkhir) {
        this.TitikAkhir = TitikAkhir;
    }

    //Menghitung panjang garis tanpa memanggil fungsi getJarak
    public double getPanjang() {
        return Math.sqrt((TitikAkhir.getAbsis() - TitikAwal.getAbsis()) * (TitikAkhir.getAbsis() - TitikAwal.getAbsis()) + (TitikAkhir.getOrdinat() - TitikAwal.getOrdinat()) * (TitikAkhir.getOrdinat() - TitikAwal.getOrdinat()));
    }

    //Menghitung gradien garis
    public double getGradien() {
        return ((TitikAkhir.getOrdinat() - TitikAwal.getOrdinat()) / (TitikAkhir.getAbsis() - TitikAwal.getAbsis()));
    }

    //Mendapatkan titik tengah dari sebuah garis
    public Titik getTitikTengah() {
        return new Titik(((TitikAwal.getAbsis() + TitikAkhir.getAbsis()) / 2), ((TitikAwal.getOrdinat() + TitikAkhir.getOrdinat()) / 2));
    }

    //Mengecek apakah garis ini sejajar dengan garis lainnya
    public boolean isSejajar(Garis garisLain) {
        return this.getGradien() == garisLain.getGradien();
    }

    //Mengecek apakah garis ini tegak lurus dengan garis lainnya
    public boolean isTegakLurus(Garis garislain) {
        return this.getGradien() * garislain.getGradien() == -1;
    }

    //Mencetak koordinat titik awal dan akhir garis
    public void printGaris() {
        System.out.println("Garis dari Titik (" + TitikAwal.getAbsis() + ", " + TitikAwal.getOrdinat() + ") ke Titik (" + TitikAkhir.getAbsis() + ", " + TitikAkhir.getOrdinat() + ")");
    }

    //Mendapatkan persamaan garis dalam bentuk string
    public String getPersamaanGaris() {
        double m = getGradien();
        double c = TitikAwal.getOrdinat() - m * TitikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}