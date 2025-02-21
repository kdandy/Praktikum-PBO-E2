/*
 * Nama File : Titik.java
 * Nama      : Dandy Faishal Fahmi 24060123140136
 * Deskripsi : berisi atribut dan method dalam class Titik
 * Tanggal   : 21 Februari 2025
 */

public class Titik {
    /* *********ATRIBUT******** */
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /* *********METHOD******** */
    // konstruktor untuk membuat titik (0,0)
    Titik() {
        this(0,0);
    }

    // konstruktor untuk membuat titik dengan nilai absis dan ordinat tertentu
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // mengembalikan nilai absis
    double getAbsis() {
        return this.absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat() {
        return this.ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        this.absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        this.ordinat = y;
    }

    // mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        this.absis += x;
        this.ordinat += y;
    }

    // mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // mengakses counter titik dengan 'this'
    void printCounterTitik() {
        System.out.println(this.counterTitik);
    }

    // mengembalikan nilai kuadran
    int getKuadran() {
        if (this.absis > 0 && this.ordinat > 0) {
            return 1;
        } else if (this.absis < 0 && this.ordinat > 0) {
            return 2;
        } else if (this.absis < 0 && this.ordinat < 0) {
            return 3;
        } else if (this.absis > 0 && this.ordinat < 0) {
            return 4;
        } else {
            return 0; // Titik berada pada titik pusat (0,0)
        }
    }

    // mengembalikan jarak titik ke titik pusat (0,0)
    double getJarakPusat() {
        return Math.sqrt(Math.pow(this.absis,2) + Math.pow(this.ordinat,2));
    }

    // mengembalikan jarak titik dengan sebuah titik lainnya
    double getJarak(Titik T2) {
        double dx = T2.absis - this.absis;
        double dy = T2.ordinat - this.ordinat;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    // melakukan refleksi terhadap sumbu X
    void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    // melakukan refleksi terhadap sumbu Y
    void refleksiY() {
        this.absis = -this.absis;
    }

    // mengembalikan titik baru hasil refleksi objek titik terhadap sumbu X
    Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    // mengembalikan titik baru hasil refleksi objek titik terhadap sumbu Y
    Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }
}

