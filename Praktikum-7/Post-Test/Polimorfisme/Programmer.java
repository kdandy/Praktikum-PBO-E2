package Polimorfisme;
/*Nama File : Programmer.java
 * Deskripsi : Berisi atribut dan method dalam class Programmer
 * Pembuat : Dandy Faishal Fahmi / 24060123140136
 * Tanggal : Kamis, 24 April 2025
*/

class Programmer extends Pegawai {
    private int bonus = 4500000;

    public Programmer(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}