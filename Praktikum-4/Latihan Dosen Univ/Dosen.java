/*
 * Nama File : Dosen.java
 * Nama      : Dandy Faishal Fahmi 24060123140136 LAB-E2
 * Deskripsi : berisi atribut dan method dalam class Dosen
 * Tanggal   : 16 Maret 2025
 */


import java.util.Date;

public abstract class Dosen extends Pegawai {
    protected String fakultas;
    
    /**
     * Konstruktor untuk kelas Dosen
     * 
     * @param nip
     * @param nama
     * @param tanggalLahir
     * @param tmt
     * @param gajiPokok
     * @param fakultas
     */
    public Dosen(String nip, String nama, Date tanggalLahir, Date tmt, double gajiPokok, String fakultas) {
        // panggil konstruktor kelas induk (Pegawai)
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
    

    @Override
    public abstract void printInfo();
    
    // Getter dan Setter
    
    /**
        @return
     */

    public String getFakultas() {
        return fakultas;
    }
    
    /**
     * @param fakultas 
     */
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
}