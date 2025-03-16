/*
 * Nama File : Main.java
 * Nama      : Dandy Faishal Fahmi 24060123140136 LAB-E2
 * Deskripsi : berisi atribut dan method dalam class Main
 * Tanggal   : 16 Maret 2025
 */

public class Main {
    public static void main(String[] args) {
        Persegi persegi2 = new Persegi();
        System.out.println("Informasi Persegi:");
        persegi2.printInfo();
        System.out.println();

        Persegi persegi = new Persegi(5.0, "Merah", "Solid");
        System.out.println("Informasi Persegi:");
        persegi.printInfo(); 
        System.out.println();

        BangunDatar.printCounterBangunDatar();
        Persegi.printCounterBangunDatar();

        System.out.println("================================");
        
        Lingkaran lingkaran1 = new Lingkaran();
        System.out.println("Informasi Lingkaran:");
        lingkaran1.printInfo();
        System.out.println();

        Lingkaran lingkaran2 = new Lingkaran(4.5, "Biru", "Putih");
        System.out.println("Informasi Lingkaran:");
        lingkaran2.printInfo();
        System.out.println();

        BangunDatar.printCounterBangunDatar();
        Lingkaran.printCounterBangunDatar();
    }
}