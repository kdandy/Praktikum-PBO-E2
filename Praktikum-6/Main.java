// Nama File : Main.java
// Nama: Dandy Faishal Fahmi
// NIM: 24060123140136
// Deskripsi: Program ini merupakan program yang menampilkan detail ruang kelas, ruang laboratorium, ruang departemen, dan ruang dosen. Program ini juga menampilkan biaya kebersihan dari masing-masing ruang.
// LAB: PBO E2
// Tanggal: 27 Maret 2025

public class Main {
    public static void main(String[] args) {
        RuangKelas kelas1 = new RuangKelas("K001", 6, 8, 3, 30, 28, 2);
        System.out.println(kelas1.getDetail());
        System.out.println("Biaya Kebersihan: " + kelas1.hitungBiayaKebersihan(10000));

        RuangLaboratorium lab1 = new RuangLaboratorium("L001", 10, 12, 4, 40, "Lab Komputer A", 500000, "Komputer");
        System.out.println(lab1.getDetail());
        System.out.println("Biaya Kebersihan: " + lab1.hitungBiayaKebersihan(15000));

        RuangDepartemen dept1 = new RuangDepartemen("D001", 5, 6, 3, 15, "Departemen IT", "Dr. Budi", 5, 10, 3);
        System.out.println(dept1.getDetail());
        System.out.println("Biaya Kebersihan: " + dept1.hitungBiayaKebersihan(12000));

        RuangDosen dosen1 = new RuangDosen("D002", 4, 5, 3, 10, "Dr. Agus", 1, 4);
        System.out.println(dosen1.getDetail());
        System.out.println("Biaya Kebersihan: " + dosen1.hitungBiayaKebersihan(12000));
    }
}
