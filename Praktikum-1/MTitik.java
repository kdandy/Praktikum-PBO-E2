/*
 * Nama File : MTitik.java
 * Nama      : Dandy Faishal Fahmi 24060123140136 LAB-E2
 * Deskripsi : Berisi atribut dan method dalam class MTitik
 * Tanggal   : 21 Februari 2025
 */

 public class MTitik {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("----KONSTRUKTOR----");
        Titik T1 = new Titik(); // Membuat objek titik T1 dengan koordinat awal (0,0)
        System.out.print("T1.printTitik(): ");
        T1.printTitik(); // Menampilkan koordinat T1 ke layar

        System.out.println("T1.setAbsis(3)");
        T1.setAbsis(3); // Mengubah nilai absis T1 menjadi 3
        System.out.println("T1.setOrdinat(4)");
        T1.setOrdinat(4); // Mengubah nilai ordinat T1 menjadi 4
        System.out.print("T1.printTitik(): ");
        T1.printTitik(); // Menampilkan kembali koordinat T1 ke layar

        System.out.println("T1.getAbsis(): " + T1.getAbsis());
        System.out.println("T1.getOrdinat(): " + T1.getOrdinat());
        
        System.out.print("T1.printTitik() sebelum geser: ");
        T1.printTitik(); // Menampilkan koordinat T1 sebelum digeser
        System.out.println("T1.geser(3, 4)");
        T1.geser(3, 4); // Menggeser T1 sejauh (3,4)
        System.out.print("T1.printTitik() setelah geser: ");
        T1.printTitik(); // Menampilkan koordinat T1 setelah digeser

        System.out.println();
        Titik T2 = T1; // T2 mereferensikan objek yang sama dengan T1
        System.out.println("Titik T2 = T1");
        System.out.print("T2.printTitik(): ");
        T2.printTitik(); // Menampilkan koordinat T2
        System.out.println("T1.setAbsis(10)");
        T1.setAbsis(10); // Mengubah absis T1 menjadi 10
        System.out.println("T1.setOrdinat(10)");
        T1.setOrdinat(10); // Mengubah ordinat T1 menjadi 10
        System.out.print("T2.printTitik(): ");
        T2.printTitik(); // Menampilkan koordinat T2 setelah perubahan pada T1

        Titik T3 = new Titik(); // Membuat objek titik T3 dengan koordinat awal (0,0)
        Titik T4 = new Titik(3, 5); // Membuat objek titik T4 dengan koordinat (3,5)

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik()); // Menampilkan jumlah objek titik yang telah dibuat
        System.out.println("Jumlah Objek Titik = " + T4.getCounterTitik()); // Memanggil metode statis dari objek T4

        System.out.print("T2.printCounterTitik(): ");  
        T2.printCounterTitik();  // Menampilkan jumlah objek titik yang telah dibuat
        // Titik.printCounterTitik();  // Error: metode non-statis tidak dapat dipanggil dalam konteks statis
        System.out.println("CounterTitik = 3 Dikarenakan telah dibuat tiga instance objek Titik (T1, T3, T4) menggunakan Titik Baru ");
        System.out.println();
        System.out.println("----getKuadran & getRefleksiY----");
        // Implementasi fungsi getKuadran dan getRefleksiY
        Titik T5 = new Titik(6, 8); // Membuat objek titik T5 dengan koordinat (6,8)
        System.out.print("T1.printTitik(): ");
        T1.printTitik(); // Menampilkan koordinat T1
        System.out.print("T5.printTitik(): ");
        T5.printTitik(); // Menampilkan koordinat T5

        System.out.println();
        System.out.println("T5.getKuadran(): " + T5.getKuadran()); // Menampilkan kuadran tempat T5 berada
        System.out.println("T5.getJarakPusat(): " + T5.getJarakPusat()); // Menampilkan jarak T5 dari pusat koordinat
        System.out.println("T1.getJarak(T5): " + T1.getJarak(T5)); // Menampilkan jarak antara T1 dan T5

        System.out.println();
        System.out.print("T1.printTitik() sebelum refleksiX: ");
        T1.printTitik(); // Menampilkan koordinat T1 sebelum refleksi terhadap sumbu X
        T1.refleksiX(); // Melakukan refleksi terhadap sumbu X  
        System.out.print("T1.printTitik() setelah refleksiX: ");
        T1.printTitik(); // Menampilkan koordinat T1 setelah refleksi terhadap sumbu X

        System.out.print("T1.printTitik() sebelum refleksiY: ");
        T1.printTitik(); // Menampilkan koordinat T1 sebelum refleksi terhadap sumbu Y
        T1.refleksiY(); // Melakukan refleksi terhadap sumbu Y
        System.out.print("T1.printTitik() setelah refleksiY: ");
        T1.printTitik(); // Menampilkan koordinat T1 setelah refleksi terhadap sumbu Y

        System.out.println();
        System.out.print("T5.printTitik(): ");
        T5.printTitik(); // Menampilkan koordinat T5
        Titik refleksiX = T5.getRefleksiX(); // Membuat objek baru hasil refleksi terhadap sumbu X
        System.out.print("Titik baru hasil T5.getRefleksiX: ");
        refleksiX.printTitik(); // Menampilkan koordinat titik baru hasil refleksi terhadap sumbu X

        Titik refleksiY = T5.getRefleksiY(); // Membuat objek baru hasil refleksi terhadap sumbu Y
        System.out.print("Titik baru hasil T5.getRefleksiY: ");
        refleksiY.printTitik(); // Menampilkan koordinat titik baru hasil refleksi terhadap sumbu Y

        System.out.println();
        System.out.println("----PRAKTIKUM-LAB-E2----");
    }
}