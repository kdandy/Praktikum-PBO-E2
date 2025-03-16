/*
 * Nama File : Tendik.java
 * Nama      : Dandy Faishal Fahmi 24060123140136 LAB-E2
 * Deskripsi : berisi atribut dan method dalam class Tendik
 * Tanggal   : 16 Maret 2025
 */

import java.util.Calendar;
import java.util.Date;

public class Tendik extends Pegawai {
    private String bidang;
    private static final int BUP = 55;
    
    /**
     * Konstruktor untuk kelas Tendik
     * 
     * @param nip
     * @param nama
     * @param tanggalLahir
     * @param tmt
     * @param gajiPokok
     * @param bidang
     */
    public Tendik(String nip, String nama, Date tanggalLahir, Date tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }
    
    /**
     * @return
     */
    public Date hitungBUP() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(tanggalLahir);
        calendar.add(Calendar.YEAR, BUP);
        calendar.add(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        
        return calendar.getTime();
    }
    
    /**
     * menghitung tunjangan
     * Tunjangan tendik = 1% x masa kerja (tahun) x gaji pokok
     * 
     * @return
     */
    @Override
    public double hitungTunjangan() {
        int[] masaKerja = hitungMasaKerja();
        // Tunjangan = 1% x masa kerja (tahun) x gaji pokok
        return 0.01 * masaKerja[0] * gajiPokok;
    }
    
    /**
     * nampilkan informasi detail tendik
     */
    @Override
    public void printInfo() {
        int[] masaKerja = hitungMasaKerja();
        Date bupDate = hitungBUP();
        double tunjangan = hitungTunjangan();
        
        System.out.println("NIP          : " + nip);
        System.out.println("Nama         : " + nama);
        System.out.println("Tanggal Lahir: " + formatTanggal(tanggalLahir));
        System.out.println("TMT          : " + formatTanggal(tmt));
        System.out.println("Jabatan      : Tenaga Kependidikan");
        System.out.println("Bidang       : " + bidang);
        System.out.println("Masa Kerja   : " + masaKerja[0] + " tahun " + masaKerja[1] + " bulan");
        System.out.println("BUP          : " + formatTanggal(bupDate));
        System.out.println("Gaji Pokok   : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan    : 1% x " + masaKerja[0] + " x Rp " + String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", tunjangan));
    }
    
    // Getter dan Setter
    
    /**
     * dapatkan bidang tendik
     * @return
     */
    public String getBidang() {
        return bidang;
    }
    
    /**
     * ubah bidang tendik
     * @param bidang
     */
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }
    
    /**
     * dapatkan nilai BUP (Batas Usia Pensiun)
     * @return
     */
    public static int getBUP() {
        return BUP;
    }
}