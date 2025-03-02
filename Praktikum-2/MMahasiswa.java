/*
 * Nama File    : MMahasiswa.java
 * Deskripsi    : Berisi program utama untuk memanggil penggunaan fungsi class Mahasiswa
 * Pembuat      : Dandy Faishal Fahmi / 24060123140136
 * Tanggal      : Kamis, 27 Februari 2025
*/

public class MMahasiswa {
        public static void main(String[] args) {
            //Mahasiswa tanpa parameter  
            Mahasiswa mhs1 = new Mahasiswa();
    
            mhs1.setnim("136");
            mhs1.setnama("Fahmi");
            mhs1.setprodi("Computer Science");
    
            //Membuat mata kuliah tanpa menggunakan parameter
            MataKuliah MK1 = new MataKuliah();
            MK1.setnama("PBO");
            MK1.setsks(3);
            mhs1.addmatkul(MK1);  
            
            MataKuliah MK2 = new MataKuliah();
            MK2.setnama("JARKOM");
            MK2.setsks(3);
            mhs1.addmatkul(MK2);  
    
            //Objek dosenWali tanpa menggunakan parameter 
            Dosen DW1 = new Dosen();
            DW1.setnama("Dewi");
            mhs1.setdosenwali(DW1);
    
            //Objek kendaraan tanpa parameter
            Kendaraan kendaraan = new Kendaraan();
            kendaraan.setjenis("Mobil");
            mhs1.setKendaraan(kendaraan);
            
            //Menampilkan detail mahasiswa 
            mhs1.printDetailMhs();

            //Menampilkan jumlah sks yang di ambil 
            System.out.println("Jumlah Sks : " + mhs1.getjumlahsks());

            //Menampilkan jumlah matkul yang di ambil 
            System.out.println("Jumlah Matkul : " + mhs1.getjumlahmatkul());
            System.out.println("\n");
    
            Mahasiswa mhs2 = new Mahasiswa("190","Mahdi","Teknik Komputer" );
            Dosen DW2 = new Dosen("665289","Naila", "Teknik Mesin");
            mhs2.setdosenwali(DW2);
            MataKuliah MK3 = new MataKuliah("GKV2025", "GKV", 3);
            MataKuliah MK4 = new MataKuliah("MBD2025", "MBD", 3);
            mhs2.addmatkul(MK3);
            mhs2.addmatkul(MK4);
            System.out.println("Jumlah Sks yang di ambil : " + mhs2.getjumlahsks());
            System.out.println("Jumlah Matkul yang di ambil : " + mhs2.getjumlahmatkul());
            mhs2.printDetailMhs();
    }
}