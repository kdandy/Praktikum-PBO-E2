// Nama File : RuangKelas.java
// Nama: Dandy Faishal Fahmi
// NIM: 24060123140136
// Deskripsi: Program ini merupakan fungsi yang digunakan untuk menampilkan detail ruang kelas.
// LAB: PBO E2
// Tanggal: 27 Maret 2025

public class RuangKelas extends Ruang {
    private int kursiTersedia;
    private int kursiRusak;

    public RuangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas, int kursiTersedia, int kursiRusak) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.kursiTersedia = kursiTersedia;
        this.kursiRusak = kursiRusak;
    }

    @Override
    public String getDetail() {
        return super.getDetail() + ", Kursi Tersedia: " + kursiTersedia + ", Kursi Rusak: " + kursiRusak;
    }
}
