/*
 * Nama File : Titik.java
 * Nama      : Dandy Faishal Fahmi 24060123140136 LAB-E2
 * Deskripsi : Berisi atribut dan metode dalam class Titik
 * Tanggal   : 21 Februari 2025
 */

 public class Titik {
    /* *********ATRIBUT******** */
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /* *********METHOD******** */
    // Konstruktor default yang menginisialisasi titik di koordinat (0,0)
    Titik() {
        this(0,0);
    }

    // Konstruktor yang menerima parameter untuk menetapkan nilai absis dan ordinat tertentu
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Mengembalikan nilai absis titik
    double getAbsis() {
        return this.absis;
    }

    // Mengembalikan nilai ordinat titik
    double getOrdinat() {
        return this.ordinat;
    }

    // Mengubah nilai absis dengan nilai baru yang diberikan
    void setAbsis(double x) {
        this.absis = x;
    }

    // Mengubah nilai ordinat dengan nilai baru y
    void setOrdinat(double y) {
        this.ordinat = y;
    }

    // Mengembalikan Nilai CounterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    // Menggeser posisi titik sejauh nilai x dan y yang diberikan
    void geser(double x, double y) {
        this.absis += x;
        this.ordinat += y;
    }

    // Menampilkan koordinat titik ke layar
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // Menampilkan jumlah objek titik menggunakan 'this'
    void printCounterTitik() {
        System.out.println(this.counterTitik);
    }

    // Menentukan kuadran tempat titik berada
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

    // Mengembalikan jarak titik dari pusat koordinat (0,0)
    double getJarakPusat() {
        return Math.sqrt(Math.pow(this.absis,2) + Math.pow(this.ordinat,2));
    }

    // Mengembalikan jarak antara titik ini dan titik lainnya yang diberikan
    double getJarak(Titik T2) {
        double dx = T2.absis - this.absis;
        double dy = T2.ordinat - this.ordinat;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    // Melakukan refleksi titik terhadap sumbu X
    void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    // Melakukan refleksi titik terhadap sumbu Y
    void refleksiY() {
        this.absis = -this.absis;
    }

    // Mengembalikan objek titik baru hasil refleksi terhadap sumbu X
    Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    // Mengembalikan objek titik baru hasil refleksi terhadap sumbu Y
    Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }
}