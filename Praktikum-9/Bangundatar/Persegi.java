/*
 *  Nama File   : Persegi.java
 *  Deskripsi   : Kelas Persegi generic, turunan BangunDatarGenerik
 *  Pembuat     : Dandy Faishal Fahmi / 24060123140136
 *  Tanggal     : 09 Mei 2025
 */
public class Persegi<T extends Number> extends BangunDatarGenerik<T> {
    private T sisi;

    public Persegi(T sisi) {
        this.sisi = sisi;
    }

    public T getSisi() {
        return sisi;
    }

    public void setSisi(T sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return Math.pow(sisi.doubleValue(), 2);
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi.doubleValue();
    }

    @Override
    public void Tampilkan() {
        System.out.println("/******************* PERSEGI *******************/");
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }

    // Contoh main untuk integrasi
    public static void main(String[] args) {
        Persegi<Double> persegi = new Persegi<>(7.0);
        persegi.Tampilkan();
    }
}


