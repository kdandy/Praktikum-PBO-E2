// Nama File : Ruang.java
// Nama: Dandy Faishal Fahmi
// NIM: 24060123140136
// Deskripsi: Program ini merupakan fungsi yang digunakan untuk menghitung biaya kebersihan dari masing-masing ruang.
// LAB: PBO E2
// Tanggal: 27 Maret 2025

public class Ruang {
    private String kode;
    private double panjang;
    private double lebar;
    private double tinggi;
    private int kapasitas;

    public Ruang(String kode, double panjang, double lebar, double tinggi, int kapasitas) {
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
    }

    public double hitungBiayaKebersihan(double tarif) {
        return panjang * lebar * tarif;
    }

    public String getDetail() {
        return "Kode Ruang: " + kode + ", Panjang: " + panjang + ", Lebar: " + lebar + ", Tinggi: " + tinggi + ", Kapasitas: " + kapasitas;
    }
}
