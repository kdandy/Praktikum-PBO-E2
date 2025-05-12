/*
 *  Nama File   : Koleksi.java
 *  Deskripsi   : Kelas generic untuk menampung objek dalam sebuah koleksi
 *  Pembuat     : Dandy Faishal Fahmi / 24060123140136
 *  Tanggal     : 09 Mei 2025
 */

import java.util.ArrayList;

public class Koleksi<T> {
    private int nbelm;              
    private ArrayList<T> wadah;     
    
    public Koleksi() {
        this.nbelm = 0;
        this.wadah = new ArrayList<>();
    }

    public T getIsi(int index) {
        if (index >= 0 && index < nbelm) {
            return wadah.get(index);
        }
        return null;
    }    

    public void setIsi(int index, T e) {
        if (index >= 0 && index < nbelm) {
            wadah.set(index, e);
        }
    }

    public int getSize() {
        return this.nbelm;
    }

    public void setSize(int x) {
        this.nbelm = x;
    }

    public void add(T e) {
        wadah.add(e);  
        nbelm++;
    }

    public T delete() {
        if (nbelm > 0) {
            T e = wadah.remove(nbelm - 1);
            nbelm--;
            return e;
        }
        return null;
    }

    public void showAll() {
        for (int i = 0; i < nbelm; i++) {
            System.out.println("elemen ke-" + (i + 1) + ": " + wadah.get(i));
        }
    }
}