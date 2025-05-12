/*  
 *  Nama File   : Main.java
 *  Deskripsi   : Program kelas App merupakan kelas utama untuk menjalankan program
 *  Pembuat     : Dandy Faishal Fahmi / 24060123140136
 *  Tanggal     : 09 Mei 2025
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        KoleksiAnabul daftarHewan = new KoleksiAnabul();
        
        String[] kucingList = {"LUNA", "OSCAR", "MILO", "NALA"};
        String[] anjingList = {"ROCKY", "BELLA", "MAX", "CHARLIE"};
        String[] burungList = {"SKY", "PEACH", "BERRY", "SUNNY"};
        
        Random acak = new Random();
        
        for (int i = 0; i < 10; i++) {
            int jenis = acak.nextInt(3);
            
            Anabul hewan;
            
            if (jenis == 0) {
                String nama = kucingList[acak.nextInt(kucingList.length)];
                hewan = new Kucing(nama);
                System.out.printf("Hewan ke-%d: Kucing bernama %s ditambahkan.%n", i+1, nama);
            } else if (jenis == 1) {
                String nama = anjingList[acak.nextInt(anjingList.length)];
                hewan = new Anjing(nama);
                System.out.printf("Hewan ke-%d: Anjing bernama %s ditambahkan.%n", i+1, nama);
            } else {
                String nama = burungList[acak.nextInt(burungList.length)];
                hewan = new Burung(nama);
                System.out.printf("Hewan ke-%d: Burung bernama %s ditambahkan.%n", i+1, nama);
            }
            
            daftarHewan.add(hewan);
        }
        
        System.out.println("\n=== Daftar Koleksi Hewan ===");
        daftarHewan.showAll();
    }
}