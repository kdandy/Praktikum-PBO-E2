/*
 * Nama File : MTitik.java
 * Nama      : Dandy Faishal Fahmi 24060123140136 LAB-E2
 * Deskripsi : Berisi atribut dan method dalam class MTitik
 * Tanggal   : 21 Februari 2025
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10); 
        T2.printTitik();

        Titik T3 = new Titik();
        Titik T4 = new Titik(3,5);
        T4.printTitik();
        System.out.println("Jumlah objek Titik =" + Titik.getCounterTitik());
        System.out.println("Titik T3 ada di kuadran : " + T3.getKuadran());
        System.out.println("Jarak T1 terhadap pusat: " + T1.getJarakPusat());
        System.out.println("Jarak T1 dengan Titik lain : " + T1.getJarak(T3));

        T3.refleksiX();
        T3.printTitik();
        Titik T5 = T3.getRefleksiX();
        T5.printTitik();
        
        Titik T6 = T3.getRefleksiY();
        T6.printTitik();

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
    }
}