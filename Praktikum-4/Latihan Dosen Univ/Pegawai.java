/*
 * Nama File : Pegawai.java
 * Nama      : Dandy Faishal Fahmi 24060123140136 LAB-E2
 * Deskripsi : berisi atribut dan method dalam class Pegawai
 * Tanggal   : 16 Maret 2025
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public abstract class Pegawai {
    protected String nip;
    protected String nama;
    protected Date tanggalLahir;
    protected Date tmt;
    protected double gajiPokok;
    
    /**
     * Konstruktor untuk kelas Pegawai
     * 
     * @param nip
     * @param nama
     * @param tanggalLahir
     * @param tmt
     * @param gajiPokok
     */
    public Pegawai(String nip, String nama, Date tanggalLahir, Date tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }
    
    /**
     * @return
     */
    public int[] hitungMasaKerja() {
        Calendar today = Calendar.getInstance();
        Calendar tmtCal = Calendar.getInstance();
        tmtCal.setTime(tmt);
        
        long diffInMillies = Math.abs(today.getTimeInMillis() - tmtCal.getTimeInMillis());
        long diffInDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        
        int years = (int) (diffInDays / 365);
        int months = (int) ((diffInDays % 365) / 30);
        
        return new int[] {years, months};
    }
    
    /**
     * menghitung tunjangan
     * 
     * @return
     */
    public abstract double hitungTunjangan();
    
    /**
     * @param date
     * @return
     */
    protected String formatTanggal(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("d MMMM yyyy");
        return sdf.format(date);
    }
    
    /**
     * nampilkan informasi detail pegawai
     */
    public abstract void printInfo();
    
    // Getter dan Setter
    
    /**
     * @return
     */
    public String getNip() {
        return nip;
    }
    
    /**
     * @param nip
     */
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    /**
     * @return
     */
    public String getNama() {
        return nama;
    }
    
    /**
     * @param nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    /**
     * @return
     */
    public Date getTanggalLahir() {
        return tanggalLahir;
    }
    
    /**
     * @param tanggalLahir
     */
    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    /**
     * @return
     */
    public Date getTmt() {
        return tmt;
    }
    
    /**
     * @param tmt
     */
    public void setTmt(Date tmt) {
        this.tmt = tmt;
    }
    
    /**
     * @return
     */
    public double getGajiPokok() {
        return gajiPokok;
    }
    
    /**
     * @param gajiPokok
     */
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
}