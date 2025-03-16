/*
 * Nama File : DosenTetap.java
 * Nama      : Dandy Faishal Fahmi 24060123140136 LAB-E2
 * Deskripsi : berisi atribut dan method dalam class DosenTetap
 * Tanggal   : 16 Maret 2025
 */

import java.util.Calendar;
import java.util.Date;

public class DosenTetap extends Dosen {
    private String nidn;
    private static final int BUP = 65;
    
    /**
     * Konstruktor untuk kelas DosenTetap
     * 
     * @param nip
     * @param nama
     * @param tanggalLahir
     * @param tmt
     * @param gajiPokok
     * @param fakultas
     * @param nidn
     */
    public DosenTetap(String nip, String nama, Date tanggalLahir, Date tmt, double gajiPokok, String fakultas, String nidn) {
        // konstruktor kelas induk (Dosen)
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }
    
    /**
     * hitung Batas Usia Pensiun (tanggal lahir + 65 tahun)
     * BUP jatuh pada tanggal 1 bulan berikutnya setelah ulang tahun ke-65
     * 
     * @return
     */
    public Date hitungBUP() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(tanggalLahir);
        calendar.add(Calendar.YEAR, BUP);
        // pindah ke tanggal 1 bulan berikutnya
        calendar.add(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        
        return calendar.getTime();
    }
    
    /**
     * menghitung tunjangan
     * Tunjangan dosen tetap = 2% x masa kerja (tahun) x gaji pokok
     * 
     * @return
     */
    @Override
    public double hitungTunjangan() {
        int[] masaKerja = hitungMasaKerja();
        // tunjangan = 2% x masa kerja (tahun) x gaji pokok
        return 0.02 * masaKerja[0] * gajiPokok;
    }
    
    /**
        menampilkan informasi detail dosen tetap
     */
    @Override
    public void printInfo() {
        int[] masaKerja = hitungMasaKerja();
        Date bupDate = hitungBUP();
        double tunjangan = hitungTunjangan();
        
        System.out.println("NIP          : " + nip);
        System.out.println("NIDN         : " + nidn);
        System.out.println("Nama         : " + nama);
        System.out.println("Tanggal Lahir: " + formatTanggal(tanggalLahir));
        System.out.println("TMT          : " + formatTanggal(tmt));
        System.out.println("Jabatan      : Dosen Tetap");
        System.out.println("Fakultas     : " + fakultas);
        System.out.println("Masa Kerja   : " + masaKerja[0] + " tahun " + masaKerja[1] + " bulan");
        System.out.println("BUP          : " + formatTanggal(bupDate));
        System.out.println("Gaji Pokok   : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan    : 2% x " + masaKerja[0] + " x Rp " + String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", tunjangan));
    }
    
    // Getter dan Setter
    
    /**
     * @return
     */
    public String getNidn() {
        return nidn;
    }
    
    /**
     * @param nidn
     */
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }
    
    /**
     * @return
     */
    public static int getBUP() {
        return BUP;
    }
}