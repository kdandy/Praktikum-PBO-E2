/*
 * Nama File    : Mahasiswa.java
 * Deskripsi    : Berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Dandy Faishal Fahmi / 24060123140136
 * Tanggal      : Kamis, 27 Februari 2025
*/

public class Mahasiswa {
    //Atribut 
    private String nim;
    private String nama;
    private String prodi;
    private MataKuliah[] listMatkul;
    private int jumlahMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    //Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new MataKuliah[50];
        this.jumlahMatkul = 0;
        this.dosenWali = null;
        this.kendaraan = null;
    }

    //Kosntruktor dengan parameter
    public Mahasiswa(String nim,String nama,String prodi) {
        this.nim = nim; 
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new MataKuliah[50];
        this.jumlahMatkul = 0;
        this.dosenWali = null;
        this.kendaraan = null;
    }

    //Selektor dan mutator 
    public String getnim() {
        return nim;
    }

    public void setnim(String nim) {
        this.nim = nim;
    }

    public String getnama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String prodi() {
        return prodi;
    }

    public void setprodi(String prodi) {
        this.prodi = prodi;
    }

    public Dosen dosenwali() {
        return dosenWali;
    }

    public void setdosenwali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    //Method unutk menambahkan mata kuliah ke dalam array 
    public void addmatkul(MataKuliah mataKuliah) {
        if (jumlahMatkul < 50) {
            listMatkul [jumlahMatkul] = mataKuliah;
            jumlahMatkul++;
        } else {
            System.out.println("mata kuliah sudah penuh");
        }
    }

    //Method untuk mendapatkan jumlah total sks
    public int getjumlahsks() {
        int totalsks = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            totalsks += listMatkul[i].getsks();
        }
        return totalsks;
    }

    //Method untuk menerapkan jumlah mata kuliah yang di ambil 
    public int getjumlahmatkul() {
        return jumlahMatkul;
    }

    //Menampilkan detail mahasiswa 
    public void printMhs() {
        System.out.println( "NIM : " + nim + ", Nama : " + nama + ", prodi : " + prodi);
    }

    //Menampilkan detail mahasiswa 
    public void printDetailMhs()    {
        System.out.println( "NIM : " + nim + ", Nama : " + nama + ", prodi : " + prodi);
        System.out.println("Mata Kuliah Yang Diambil : ");
        for (int i = 0; i < jumlahMatkul;i++)   {
        System.out.println("- " + listMatkul[i].getnama() + " (" + listMatkul[i].getsks() + " SKS)");
        }
        System.out.println("Dosen Wali: " + (dosenWali != null ? dosenWali.getnama() : "Belum ditentukan"));
        System.out.println("Kendaraan: " + (kendaraan != null ? kendaraan.getjenis() : "Belum ditentukan"));
    }
}