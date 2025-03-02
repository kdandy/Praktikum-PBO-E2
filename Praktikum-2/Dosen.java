/*
 * Nama File    : Dosen.java
 * Deskripsi    : Berisi atribut dan method dalam class Dosen
 * Pembuat      : Dandy Faishal Fahmi / 24060123140136
 * Tanggal      : Kamis, 27 Februari 2025
*/

public class Dosen {
    //Atribut
    private String nip;
    private String nama;
    private String prodi;

    //Konstruktor
    public Dosen() {
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    //Konstruktor dengan parameter 
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //Selektor (getter)
    public String getnip() {
        return nip;
    }

    public String getnama() {
        return nama;
    }

    public String getprodi() {
        return prodi;
    }

    //Mutator (setter)
    public void setnip(String nip) {
        this.nip = nip;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public void setprodi(String prodi) {
        this.prodi = prodi;
    }
}   

