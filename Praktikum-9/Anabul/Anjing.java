/*
 *  Nama File   : Anjing.java
 *  Deskripsi   : Kelas turunan Anabul yang merepresentasikan hewan anjing
 *  Pembuat     : Dandy Faishal Fahmi / 24060123140136
 *  Tanggal     : 09 Mei 2025
 */

public class Anjing extends Anabul {
    
    public Anjing(String nama) {
        super(nama);
    }
    
    @Override
    public void Gerak() {
        System.out.println(nama + " sedang berjalan dengan lincah.");
    }
    
    @Override
    public void Bersuara() {
        System.out.println(nama + " bersuara: guk-guk!");
    }
}