package Polimorfisme;
/*Nama File : Manager.java
 * Deskripsi : Berisi atribut dan method dalam class Manajer
 * Pembuat : Dandy Faishal Fahmi / 24060123140136
 * Tanggal : Kamis, 24 April 2025
*/

class Manager extends Pegawai {
    private int tunjangan = 7000000;

    public Manager(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}