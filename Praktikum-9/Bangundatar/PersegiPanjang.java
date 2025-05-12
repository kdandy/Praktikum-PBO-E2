/*
 *  Nama File   : PersegiPanjang.java
 *  Deskripsi   : Kelas PersegiPanjang generic, turunan BangunDatarGenerik
 *  Pembuat     : Dandy Faishal Fahmi / 24060123140136
 *  Tanggal     : 09 Mei 2025
 */
public class PersegiPanjang<T extends Number> extends BangunDatarGenerik<T> {
    private T panjang, lebar;

    public PersegiPanjang(T panjang, T lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public T getPanjang() {
        return panjang;
    }

    public void setPanjang(T panjang) {
        this.panjang = panjang;
    }

    public T getLebar() {
        return lebar;
    }

    public void setLebar(T lebar) {
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang.doubleValue() * lebar.doubleValue();
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang.doubleValue() + lebar.doubleValue());
    }

    @Override
    public void Tampilkan() {
        System.out.println("/******************* PERSEGI PANJANG *******************/");
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }

    // Contoh main untuk integrasi
    public static void main(String[] args) {
        PersegiPanjang<Double> pp = new PersegiPanjang<>(8.0, 3.0);
        pp.Tampilkan();
    }
}
