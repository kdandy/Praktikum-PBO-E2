/*
 * Nama File : MTitik.java
 * Nama      : Dandy Faishal Fahmi 24060123140136
 * Deskripsi : berisi atribut dan method dalam class MTitik
 * Tanggal   : 21 Februari 2025
 */

public class MTitik {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("--KONSTRUKTOR - GETTER - SETTER - GESER - PRINT--");
        Titik T1 = new Titik(); //membuat objek titik T1 (0,0)
        System.out.print("> T1.printTitik(): ");
        T1.printTitik(); //mencetak koordinat T1 ke layar

        System.out.println("- T1.setAbsis(3)");
        T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        System.out.println("- T1.setOrdinat(4)");
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        System.out.print("> T1.printTitik(): ");
        T1.printTitik(); //mencetak koordinat T1 ke layar
        
        System.out.println("> T1.getAbsis(): " + T1.getAbsis());
        System.out.println("> T1.getOrdinat(): " + T1.getOrdinat());
        
        System.out.print("> T1.printTitik() sebelum geser: ");
        T1.printTitik(); //mencetak koordinat T1 ke layar
        System.out.println("- T1.geser(3, 4)");
        T1.geser(3, 4); //menggeser T1 sejauh (3,4)
        System.out.print("> T1.printTitik() setelah geser: ");
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser

        System.out.println();
        Titik T2 = T1; //T2 dan T1 mereferensi objek yang sama di memori
        System.out.println("- Titik T2 = T1");
        System.out.print("> T2.printTitik(): ");
        T2.printTitik(); //menampilkan koordinat T2
        System.out.println("- T1.setAbsis(10)");
        T1.setAbsis(10); //mengubah absis T1 dengan nilai 10
        System.out.println("- T1.setOrdinat(10)");
        T1.setOrdinat(10); //mengubah ordinat T1 dengan nilai 10
        System.out.print("> T2.printTitik(): ");
        T2.printTitik(); //menampilkan koordinat T2 setelah koordinat T1 diubah

        Titik T3 = new Titik(); //membuat objek titik T3 (0,0)
        Titik T4 = new Titik(3, 5); //membuat objek titik T4 (3,5)

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik()); //memanggil method static dari class Titik
        System.out.println("Jumlah Objek Titik = " + T4.getCounterTitik()); //memanggil method static dari objek T4

        System.out.print("T2.printCounterTitik(): ");  
        T2.printCounterTitik();  // 3
        // Titik.printCounterTitik();  // error: non-static method printCounterTitik() cannot be referenced from a static context
        System.out.println("CounterTitik = 3 karena telah diinstansiasi 3 Titik (T1, T3, T4) menggunakan 'new Titik'");


        System.out.println();
        System.out.println("--getKuadran & getRefleksiY--");
        // Implementasi fungsi dan prosedur dari getKuadran hingga getRefleksiY
        Titik T5 = new Titik(6, 8); //membuat objek titik T5 (6,8)
        System.out.print("T1.printTitik(): ");
        T1.printTitik(); //menampilkan koordinat T1
        System.out.print("T5.printTitik(): ");
        T5.printTitik(); //menampilkan koordinat T5

        System.out.println();
        System.out.println("T5.getKuadran(): " + T5.getKuadran()); //menampilkan kuadran T1
        System.out.println("T5.getJarakPusat(): " + T5.getJarakPusat()); //menampilkan jarak T1 ke pusat
        System.out.println("T1.getJarak(T5): " + T1.getJarak(T5)); //menampilkan jarak T1 ke T5

        System.out.println();
        System.out.print("T1.printTitik() sebelum refleksiX: ");
        T1.printTitik(); //menampilkan koordinat T1 sebelum refleksiX
        T1.refleksiX(); //melakukan refleksi terhadap sumbu X  
        System.out.print("T1.printTitik() setelah refleksiX: ");
        T1.printTitik(); //menampilkan koordinat T1 setelah refleksiX

        System.out.print("T1.printTitik() sebelum refleksiY: ");
        T1.printTitik(); //menampilkan koordinat T1 sebelum refleksiY
        T1.refleksiY(); //melakukan refleksi terhadap sumbu Y
        System.out.print("T1.printTitik() setelah refleksiY: ");
        T1.printTitik(); //menampilkan koordinat T1 setelah refleksiY

        System.out.println();
        System.out.print("T5.printTitik(): ");
        T5.printTitik(); //menampilkan koordinat T5
        Titik refleksiX = T5.getRefleksiX(); //mendapatkan titik baru hasil refleksiX
        System.out.print("Titik baru hasil T5.getRefleksiX: ");
        refleksiX.printTitik(); //menampilkan koordinat titik baru hasil refleksiX

        Titik refleksiY = T5.getRefleksiY(); //mendapatkan titik baru hasil refleksiY
        System.out.print("Titik baru hasil T5.getRefleksiY: ");
        refleksiY.printTitik(); //menampilkan koordinat titik baru hasil refleksiY

        System.out.println();
        System.out.println("--------------------------Terima Kasih--------------------------");
    }
}