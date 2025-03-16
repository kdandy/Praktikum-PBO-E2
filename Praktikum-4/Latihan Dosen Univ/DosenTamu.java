/*
 * Nama File : DosenTamu.java
 * Nama      : Dandy Faishal Fahmi 24060123140136 LAB-E2
 * Deskripsi : berisi atribut dan method dalam class DosenTamu
 * Tanggal   : 16 Maret 2025
 */

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DosenTamu extends Dosen {
    private String nidk;
    private Date tanggalBerakhirKontrak;
    
    /**
     * Konstruktor untuk kelas DosenTamu
     * 
     * @param nip
     * @param nama
     * @param tanggalLahir
     * @param tmt
     * @param gajiPokok
     * @param fakultas
     * @param nidk
     * @param tanggalBerakhirKontrak
     */
    public DosenTamu(String nip, String nama, Date tanggalLahir, Date tmt, double gajiPokok, String fakultas, 
                        String nidk, Date tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }
    
    /**
     * Menghitung sisa masa kontrak dalam bulan
     * 
     * @return 
     */
    public int hitungSisaKontrak() {
        Calendar today = Calendar.getInstance();
        Calendar endContract = Calendar.getInstance();
        endContract.setTime(tanggalBerakhirKontrak);
        
        long diffInMillies = Math.abs(endContract.getTimeInMillis() - today.getTimeInMillis());
        long diffInDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        
        return (int) (diffInDays / 30);
    }
    
    /**
     * menghitung tunjangan
     * tunjangan dosen tamu = 2,5% x gaji pokok
     * 
     * @return
     */
    @Override
    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }
    
    /**
     * menampilkan informasi detail dosen tamu
     */
    @Override
    public void printInfo() {
        int[] masaKerja = hitungMasaKerja();
        int sisaKontrak = hitungSisaKontrak();
        double tunjangan = hitungTunjangan();
        
        System.out.println("NIP                   : " + nip);
        System.out.println("NIDK                  : " + nidk);
        System.out.println("Nama                  : " + nama);
        System.out.println("Tanggal Lahir         : " + formatTanggal(tanggalLahir));
        System.out.println("TMT                   : " + formatTanggal(tmt));
        System.out.println("Jabatan               : Dosen Tamu");
        System.out.println("Fakultas              : " + fakultas);
        System.out.println("Masa Kerja            : " + masaKerja[0] + " tahun " + masaKerja[1] + " bulan");
        System.out.println("Tanggal Akhir Kontrak : " + formatTanggal(tanggalBerakhirKontrak));
        System.out.println("Sisa Masa Kontrak     : " + sisaKontrak + " bulan");
        System.out.println("Gaji Pokok            : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan             : 2.5% x Rp " + String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", tunjangan));
    }
    
    // Getter dan Setter
    
    /**
     * @return
     */
    public String getNidk() {
        return nidk;
    }
    
    /**
     * @param nidk
     */
    public void setNidk(String nidk) {
        this.nidk = nidk;
    }
    
    /**
     * @return
     */
    public Date getTanggalBerakhirKontrak() {
        return tanggalBerakhirKontrak;
    }
    
    /**
     * @param tanggalBerakhirKontrak
     */
    public void setTanggalBerakhirKontrak(Date tanggalBerakhirKontrak) {
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }
}