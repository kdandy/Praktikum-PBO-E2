/*
 *  Nama File   : Kucing.java
 *  Deskripsi   : Kelas turunan Anabul yang merepresentasikan hewan kucing
 *  Pembuat     : Dandy Faishal Fahmi / 24060123140136
 *  Tanggal     : 09 Mei 2025
 */

public class Kucing extends Anabul {
    
    public Kucing(String nama) {
        super(nama);
    }
    
    @Override
    public void Gerak() {
        System.out.println(nama + " melompat dan mengendap-endap.");
    }
    
    @Override
    public void Bersuara() {
        System.out.println(nama + " bersuara: meong!");
    }
}