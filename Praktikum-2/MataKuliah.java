/*
 * Nama File    : MataKuliah.java
 * Deskripsi    : Berisi atribut dan method dalam class MataKuliah
 * Pembuat      : Dandy Faishal Fahmi / 24060123140136
 * Tanggal      : Kamis, 27 Februari 2025
*/

public class MataKuliah {
    //Atribut
    private String idMatkul;
    private String nama;
    private int sks;

    public MataKuliah() {
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    public MataKuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    //Selektor (getter)
    public String getidMatkul() {
        return idMatkul;
    }

    public String getnama() {
        return nama;
    }

    public int getsks() {
        return sks;
    }

    //Mutator (setter)
    public void setidMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public void setsks(int sks) {
        this.sks = sks;
    }
}