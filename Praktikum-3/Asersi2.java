/*Nama File     : Asersi2.java
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input jari-jari Lingkaran1 yang bernilai nol
 * Pembuat      : Dandy Faishal Fahmi // 24060123140136
 * Tanggal      : Kamis, 6 Maret 2025
*/

//class Lingkaran1
class Lingkaran1 {
    private double jariJari;
    public Lingkaran1(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0): "jari jari tidak boleh nol!!!";
        Lingkaran1 l = new Lingkaran1(jariJari);
        double kelilingLingkaran1 = l.hitungKeliling();
        System.out.println("keliling Lingkaran1 =" + kelilingLingkaran1);
    }
}

//PERTANYAAN: secara konsep, ada yang kurang tepat pada program Asersi di atas. Jelaskan
//JAWABAN:

//Kesalahan konsep dalam penggunaan asersi untuk validasi input. Jika asersi dinonaktifkan, validasi tidak berjalan. 
//Sebaiknya gunakan exception handling (if-else + throw) untuk validasi input seperti jari-jari Lingkaran1 yang negatif.

