/*
 * Nama File    : MMataKuliah.java
 * Deskripsi    : Berisi program utama untuk memanggil penggunaan fungsi class MataKuliah
 * Pembuat      : Dandy Faishal Fahmi / 24060123140136
 * Tanggal      : Kamis, 27 Februari 2025
*/

public class MMataKuliah {
        public static void main(String[] args) {
            //Tanpa parameter 
            MataKuliah MK1 = new MataKuliah();
            MK1.setidMatkul("CYBERSECURITY25");
            MK1.setnama("CYBERSEC");
            MK1.setsks(3);
    
            System.out.println("Id Matkul : " + MK1.getidMatkul());
            System.out.println("Nama : " + MK1.getnama());
            System.out.println("SKS : " + MK1.getsks());
    
            //Menggunakan parameter 
            MataKuliah MK2 = new MataKuliah("KRIPTO25", "KRIPTO", 3);
    
            System.out.println("\nId Matkul :" + MK2.getidMatkul());
            System.out.println("nama :" + MK2.getnama());
            System.out.println("SKS :" + MK2.getsks());
    }
}
