// Nama File : RuangDepartemen.java
// Nama: Dandy Faishal Fahmi
// NIM: 24060123140136
// Deskripsi: Program ini merupakan fungsi yang digunakan untuk menampilkan detail ruang departemen.
// LAB: PBO E2
// Tanggal: 27 Maret 2025

public class RuangDepartemen extends Ruang {
    private String namaDepartemen;
    private String ketuaDepartemen;
    private int jumlahMeja;
    private int jumlahKursi;
    private int jumlahLemari;

    public RuangDepartemen(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaDepartemen, String ketuaDepartemen, int jumlahMeja, int jumlahKursi, int jumlahLemari) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaDepartemen = namaDepartemen;
        this.ketuaDepartemen = ketuaDepartemen;
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.jumlahLemari = jumlahLemari;
    }

    @Override
    public String getDetail() {
        return super.getDetail() + ", Nama Departemen: " + namaDepartemen + ", Ketua Departemen: " + ketuaDepartemen + ", Meja: " + jumlahMeja + ", Kursi: " + jumlahKursi + ", Lemari: " + jumlahLemari;
    }
}
