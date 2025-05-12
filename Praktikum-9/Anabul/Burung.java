/*
 *  Nama File   : Burung.java
 *  Deskripsi   : Kelas turunan Anabul yang merepresentasikan hewan burung
 *  Pembuat     : Dandy Faishal Fahmi / 24060123140136
 *  Tanggal     : 09 Mei 2025
 */

public class Burung extends Anabul {
    
    public Burung(String nama) {
        super(nama);
    }
    
    @Override
    public void Gerak() {
        System.out.println(nama + " terbang tinggi di udara.");
    }
    
    @Override
    public void Bersuara() {
        System.out.println(nama + " berkicau: cuit-cuit!");
    }
}