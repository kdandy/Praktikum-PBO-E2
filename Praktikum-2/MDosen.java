/*
 * Nama File    : MDosen.java
 * Deskripsi    : Berisi program utama untuk memanggil penggunaan fungsi class Dosen
 * Pembuat      : Dandy Faishal Fahmi / 24060123140136
 * Tanggal      : Kamis, 27 Februari 2025
*/

public class MDosen {
        public static void main(String[] args) {
            //Tanpa parameter 
            Dosen D1 = new Dosen();
            D1.setnip("665289");
            D1.setnama("Naila");
            D1.setprodi("Teknik Mesin");
    
            System.out.println("NIP: " + D1.getnip());
            System.out.println("Nama: " + D1.getnama());
            System.out.println("Prodi: " + D1.getnip());
    
            //Menggunakan parameter 
            Dosen D2 = new Dosen("663482", "Shanasya", "Teknik Komputer");
            System.out.println("\nNIP: " + D2.getnip());
            System.out.println("Nama: " + D2.getnama());
            System.out.println("Prodi: " + D2.getprodi());
    }
}