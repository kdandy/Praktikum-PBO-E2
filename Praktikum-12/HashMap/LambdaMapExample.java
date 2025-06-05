package HashMap;
import java.util.HashMap;
import java.util.Map;

/**
 * File: LambdaMapExample.java
 * Deskripsi: Implementasi lambda pada Map, digunakan sebagai parameter
 * Pembuat : Dandy Faishal Fahmi / 24060123140136
 * Tanggal : 5 Juni 2025
 * Lab : PBO E2
 */

public class LambdaMapExample {
    public static void main(String[] args) {
        // Membuat Map dengan key = NIM, value = Nama Mahasiswa
        Map<String, String> mahasiswa = new HashMap<>();

        // Menambahkan data mahasiswa
        mahasiswa.put("24060123140136", "Aldo Prasetyo");
        mahasiswa.put("24060123140137", "Bunga Melati");
        mahasiswa.put("24060123140138", "Cahyo Nugroho");
        mahasiswa.put("24060123140139", "Dewi Lestari");

        // Menampilkan key dan value menggunakan ekspresi lambda
        mahasiswa.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + " | Nama: " + nama);
        });
    }
}
