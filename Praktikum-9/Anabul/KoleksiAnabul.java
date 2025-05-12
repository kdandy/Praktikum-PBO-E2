/*
 *  Nama File   : KoleksiAnabul.java
 *  Deskripsi   : Kelas pembungkus koleksi hewan Anabul
 *  Pembuat     : Dandy Faishal Fahmi / 24060123140136
 *  Tanggal     : 09 Mei 2025
 */

public class KoleksiAnabul {
    private Koleksi<Anabul> koleksi;
    
    public KoleksiAnabul() {
        koleksi = new Koleksi<>();
    }
    
    public void add(Anabul anabul) {
        koleksi.add(anabul);
    }
    
    public Anabul getAnabul(int index) {
        return koleksi.getIsi(index);
    }
    
    public int getSize() {
        return koleksi.getSize();
    }
    
    public void showAll() {
        System.out.println("Total hewan dalam koleksi: " + koleksi.getSize());
        for (int i = 0; i < koleksi.getSize(); i++) {
            Anabul hewan = koleksi.getIsi(i);
            System.out.println("\nData Hewan ke-" + (i + 1) + ":");
            System.out.println("Nama: " + hewan.getNama());
            hewan.Bersuara();
            hewan.Gerak();
        }
    }
}