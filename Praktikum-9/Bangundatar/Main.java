/*
 *  Nama File   : Main.java
 *  Deskripsi   : Program untuk mendemonstrasikan penggunaan kelas generik
 *  Pembuat     : Dandy Faishal Fahmi / 24060123140136
 *  Tanggal     : 09 Mei 2025
 */
public class Main {
     public static void main(String[] args) {
       
        System.out.println("\n/******************* BANGUN DATAR GENERIC *******************/");
        Persegi<Double> Persegi = new Persegi<>(11.0);
        PersegiPanjang<Double> PersegiPanjang = new PersegiPanjang<>(3.0, 9.0);
        Segitiga<Double> segitiga = new Segitiga<>(10.0, 24.0, 23.0, 56.0, 12.0);
        
        Persegi.Tampilkan();
        System.out.println();
        
        PersegiPanjang.Tampilkan();
        System.out.println();
        
        segitiga.Tampilkan();
        
        System.out.println("\n/******************* HASIL INTEGER *******************/");
        Persegi<Integer> PersegiInt = new Persegi<>(4);
        PersegiInt.Tampilkan();    
    }
    
}
