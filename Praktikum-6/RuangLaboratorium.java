// Nama File : RuangLaboratorium.java
// Nama: Dandy Faishal Fahmi
// NIM: 24060123140136
// Deskripsi: Program ini merupakan fungsi yang digunakan untuk menampilkan detail ruang laboratorium.
// LAB: PBO E2
// Tanggal: 27 Maret 2025

public class RuangLaboratorium extends Ruang {
    private String namaLaboratorium;
    private double hargaSewa;
    private String kategori;

    public RuangLaboratorium(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLaboratorium, double hargaSewa, String kategori) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLaboratorium = namaLaboratorium;
        this.hargaSewa = hargaSewa;
        this.kategori = kategori;
    }

    @Override
    public String getDetail() {
        return super.getDetail() + ", Nama Laboratorium: " + namaLaboratorium + ", Harga Sewa: " + hargaSewa + ", Kategori: " + kategori;
    }
}
