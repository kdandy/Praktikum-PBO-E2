/*
 *  Nama File   : ArrayListTest.java
 *  Deskripsi   : Program penggunaan objek ArrayList sebagai Collection class
 *  Pembuat     : Dandy Faishal Fahmi / 24060123140136
 *  Tanggal     : 09 Mei 2025
 */

import java.util.ArrayList;

public class ArrayListTast {
    public static void main(String[] args){
        ArrayList<String>  string = new ArrayList<String>();

        string.add("praktikum");
        string.add("collection ");
        string.add("dan Generik");

        string.remove("praktikum");

        for(String s : string){
            System.out.print(s+"");
        }
    }
    
}