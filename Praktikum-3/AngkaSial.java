/*Nama File     : AngkaSial.java
 * Deskripsi    : Program penggunaan exception buatan sendiri pengenalan klausa 'throw' dan 'throws' 
 * Pembuat      : Dandy Faishal Fahmi // 24060123140136
 * Tanggal      : Kamis, 6 Maret 2025
*/

public class AngkaSial {
 public void cobaAngka(int angka) throws AngkaSialException {
    if (angka == 13) {
        throw new AngkaSialException();
    }
    System.out.println(angka+"bukan angka sial");
 }  

 public static void main(String[] args) {
    AngkaSial as = new AngkaSial() ;
    try {
        as.cobaAngka(10);
        as.cobaAngka(13);
        as.cobaAngka(12);
    } catch (AngkaSialException ase) {
        //method getMessage() telah ada pada kelas "Exception"
        System.out.println(ase.getMessage());
        System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

//PERTANYAAN1: Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
//JAWABAN:

//Jika eksepsi terjadi sebelum eksekusi mencapai baris 12, maka baris tersebut tidak akan dieksekusi. 
//Hal ini karena Java akan langsung berpindah ke blok catch atau keluar dari metode jika eksepsi tidak ditangani.

//PERTANYAAN2: Apakah baris 21 pada AngkaSial.java di atas di eksekusi?
//JAWABAN:

//Jika baris 21 berada setelah terjadi eksepsi yang tidak ditangani dengan baik, maka baris tersebut tidak akan dieksekusi. 
//Namun, jika eksepsi ditangani dengan benar dalam blok catch, maka eksekusi dapat dilanjutkan setelah blok catch, tergantung pada struktur programnya.