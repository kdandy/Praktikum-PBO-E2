// Nama File : RuangDosen.java
// Nama: Dandy Faishal Fahmi
// NIM: 24060123140136
// Deskripsi: Program ini merupakan fungsi yang digunakan untuk menampilkan detail ruang dosen.
// LAB: PBO E2
// Tanggal: 27 Maret 2025

public class RuangDosen extends Ruang {
    private String namaDosen;
    private int jumlahMeja;
    private int jumlahKursi;

    public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaDosen, int jumlahMeja, int jumlahKursi) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaDosen = namaDosen;
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
    }

    @Override
    public String getDetail() {
        return super.getDetail() + ", Nama Dosen: " + namaDosen + ", Meja: " + jumlahMeja + ", Kursi: " + jumlahKursi;
    }
}
