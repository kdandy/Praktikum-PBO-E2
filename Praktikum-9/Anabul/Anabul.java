/*
 *  Nama File   : Anabul.java
 *  Deskripsi   : Kelas abstrak sebagai superclass untuk hewan peliharaan (anabul)
 *  Pembuat     : Dandy Faishal Fahmi / 24060123140136
 *  Tanggal     : 09 Mei 2025
 */

public abstract class Anabul {
    protected String nama;
    
    public Anabul(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    

    public abstract void Gerak();
    public abstract void Bersuara();
}