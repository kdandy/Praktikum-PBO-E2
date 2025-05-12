/*
 *  Nama File   : Segitiga.java
 *  Deskripsi   : Kelas Segitiga generic, turunan BangunDatarGenerik
 *  Pembuat     : Dandy Faishal Fahmi / 24060123140136
 *  Tanggal     : 09 Mei 2025
 */
public class Segitiga<T extends Number> extends BangunDatarGenerik<T> {
    private T alas;
    private T tinggi;
    private T sisi1;
    private T sisi2;
    private T sisi3;

    public Segitiga(T alas, T tinggi, T sisi1, T sisi2, T sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public T getAlas() { return alas; }
    public void setAlas(T alas) { this.alas = alas; }
    public T getTinggi() { return tinggi; }
    public void setTinggi(T tinggi) { this.tinggi = tinggi; }
    public T getSisi1() { return sisi1; }
    public void setSisi1(T sisi1) { this.sisi1 = sisi1; }
    public T getSisi2() { return sisi2; }
    public void setSisi2(T sisi2) { this.sisi2 = sisi2; }
    public T getSisi3() { return sisi3; }
    public void setSisi3(T sisi3) { this.sisi3 = sisi3; }

    @Override
    public double hitungLuas() {
        return 0.5 * alas.doubleValue() * tinggi.doubleValue();
    }

    @Override
    public double hitungKeliling() {
        return sisi1.doubleValue() + sisi2.doubleValue() + sisi3.doubleValue();
    }

    @Override
    public void Tampilkan() {
        System.out.println("/******************* SEGITIGA *******************/");
        System.out.println("Alas: " + alas);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Sisi 1: " + sisi1);
        System.out.println("Sisi 2: " + sisi2);
        System.out.println("Sisi 3: " + sisi3);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }

    // Contoh main untuk integrasi
    public static void main(String[] args) {
        Segitiga<Double> segitiga = new Segitiga<>(6.0, 4.0, 5.0, 6.0, 7.0);
        segitiga.Tampilkan();
    }
}
