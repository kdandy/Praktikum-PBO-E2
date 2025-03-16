/*
 * Nama File : Main.java
 * Nama      : Dandy Faishal Fahmi 24060123140136 LAB-E2
 * Deskripsi : berisi atribut dan method dalam class Main
 * Tanggal   : 16 Maret 2025
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy", new Locale("id", "ID"));
        
        try {
            // Membuat objek DosenTetap
            Date tanggalLahirAndi = dateFormat.parse("5 Mei 1990");
            Date tmtAndi = dateFormat.parse("1 Januari 2015");
            DosenTetap dosenTetap = new DosenTetap(
                "954564754", "Andi", tanggalLahirAndi, tmtAndi, 5000000.00,
                "Fakultas Sains dan Matematika", "78647324"
            );
            
            // Membuat objek DosenTamu
            Date tanggalLahirBudi = dateFormat.parse("15 Juni 1988");
            Date tmtBudi = dateFormat.parse("1 September 2018");
            Date akhirKontrakBudi = dateFormat.parse("31 Agustus 2025");
            DosenTamu dosenTamu = new DosenTamu(
                "876543210", "Budi", tanggalLahirBudi, tmtBudi, 4500000.00,
                "Fakultas Teknik", "12345678", akhirKontrakBudi
            );
            
            // Membuat objek Tendik
            Date tanggalLahirCici = dateFormat.parse("20 Juli 1985");
            Date tmtCici = dateFormat.parse("1 Maret 2013");
            Tendik tendik = new Tendik(
                "654321098", "Cici", tanggalLahirCici, tmtCici, 3500000.00,
                "Akademik"
            );
            
            // Menampilkan informasi pegawai
            System.out.println("====== INFORMASI DOSEN TETAP ======");
            dosenTetap.printInfo();
            System.out.println("\n====== INFORMASI DOSEN TAMU ======");
            dosenTamu.printInfo();
            System.out.println("\n====== INFORMASI TENAGA KEPENDIDIKAN ======");
            tendik.printInfo();
            
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }
    }
}