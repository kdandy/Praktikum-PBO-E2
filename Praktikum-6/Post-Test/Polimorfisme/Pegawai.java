package Polimorfisme;
/*Nama File : Pegawai.java
 * Deskripsi : Berisi atribut dan method dalam class Pegawai
 * Pembuat : Dandy Faishal Fahmi / 24060123140136
 * Tanggal : Kamis, 24 April 2025
*/

class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}