/*
 * Nama File : Titik.java
 * Nama      : Dandy Faishal Fahmi 24060123140136 LAB-E2
 * Deskripsi : Berisi atribut dan metode dalam class Titik
 * Tanggal   : 21 Februari 2025
 */

public class Titik {
    /****************ATRIBUT*****************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /****************METHOD*****************/
    //Konstruktor untuk membuat titik (0,0)

    //Konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    public Titik() {
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    //Overloading
    public Titik(double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    //Mengembalikan nilai counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }

    //Mengembalikan nilai absis 
    public double getAbsis() {
        return absis;
    }

    //Mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    //Mengeset absis titik dengan nilai baru y
    public void setAbsis(double x){
        absis = x;
    }

    //Mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }
    
    //Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mengecek koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    public int getKuadran() {
        if (this.absis > 0 && this.ordinat > 0) {
            return 1;
        } else if (this.absis < 0 && this.ordinat > 0) {
            return 2;
        } else if (this.absis < 0 && this.ordinat < 0) {
            return 3;
        } else if (this.absis > 0 && this.ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public double getJarakPusat() {
        return Math.sqrt(this.absis) + (this.ordinat);
    }

    public double getJarak(Titik T) {
        return Math.sqrt(((T.absis-absis) * (T.absis-absis)) + (T.ordinat-ordinat) * (T.ordinat-ordinat));
    }

    public void refleksiX() {
        this.ordinat = ordinat * - this.ordinat;
    }

    public void refleksiY() {
        this.absis = absis * - this.absis;
    }

    public Titik getRefleksiX() {
        Titik T3 = new Titik(this.absis, this.ordinat * - this.ordinat);
        return T3;
    }

    public Titik getRefleksiY() {
        Titik T3 = new Titik(this.absis * - this.absis, this.ordinat);
        return T3;
    }
}
