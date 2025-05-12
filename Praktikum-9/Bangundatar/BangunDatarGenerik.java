/*  
 *  Nama File   : BangunDatarGeneric.java
 *  Deskripsi   : Program untuk mendefinisikan kelas abstrak BangunDatarGeneric
 *  Pembuat     : Dandy Faishal Fahmi / 24060123140136
 *  Tanggal     : 09 Mei 2025
 */

public abstract class BangunDatarGenerik<T extends Number> {
    public abstract double hitungLuas();
    
    public abstract double hitungKeliling();

    public void Tampilkan() {
        System.out.println("Luas     : " + hitungLuas());
        System.out.println("Keliling : " + hitungKeliling());
    }
}
