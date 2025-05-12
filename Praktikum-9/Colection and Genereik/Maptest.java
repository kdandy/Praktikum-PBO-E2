/*
 *  Nama File   : Maptest.java
 *  Deskripsi   : Program penggunaan objek HashMap sebagai implementasi Map interface
 *  Pembuat     : Dandy Faishal Fahmi / 24060123140136
 *  Tanggal     : 09 Mei 2025
 */

import java.util.*;

public class Maptest {
    public static void main(String[] args) {
        // Membuat objek Map dengan HashMap
        Map<Integer, String> map = new HashMap<Integer, String>();
        
        // Menambahkan elemen ke Map
        map.put(1, "satu");
        map.put(2, "dua");
        map.put(5, "lima");
        map.put(9, "sembilan");

        // Mengambil nilai dengan key tertentu
        System.out.println("Nilai dengan key 9: " + map.get(9));

        // Mengambil semua key dari Map
        Set<Integer> keys = map.keySet();
        
        // Menampilkan semua key dan value
        System.out.println("\nDaftar key dan value dalam Map:");
        for (Integer key : keys) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        
        // Cara lain untuk iterasi Map menggunakan entrySet
        System.out.println("\nIterasi menggunakan entrySet:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}