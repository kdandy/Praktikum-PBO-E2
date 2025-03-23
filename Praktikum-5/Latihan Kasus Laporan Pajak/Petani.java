/*  Nama File : Petani.java
    Deskripsi : class Petani merupakan subclass dari class Manusia dan mengimplementasi interface Pajak.
    Pembuat   : Dandy Faishal Fahmi 24060123140136
    Tanggal   : 20 Maret 2025 
*/

import java.util.Date;
import java.util.Calendar;

public class Petani extends Manusia implements Pajak {
  private String asal_daerah;
  private static int counterPetani = 0;

  // konstruktor tanpa parameter
  public Petani() {
    this.asal_daerah = "Belum diisi";
    counterPetani++;
  }

  // konstruktor dengan parameter
  public Petani(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String asal_daerah) {
    super(nama, tgl_mulai_kerja, alamat, pendapatan);
    this.asal_daerah = asal_daerah;
    counterPetani++;
  }

  @Override
  public double hitungPajak() {
    // tidak ada pajak untuk petani
    return 0;
  }

  @Override
  protected int hitungMasaKerja() {
    Calendar now = Calendar.getInstance();
    Calendar start = Calendar.getInstance();
    start.setTime(getTglMulaiKerja());

    int years = now.get(Calendar.YEAR) - start.get(Calendar.YEAR);
    // tambahkan C (C = 1, diambil dari digit NIM ke-12)
    return years + 1;
  }

  @Override
  public void cetakInfo() {
    super.cetakInfo();
    System.out.println("Asal Daerah: " + asal_daerah);
  }

  // getters and setters
  public String getAsalDaerah() {
    return asal_daerah;
  }

  public void setAsalDaerah(String asal) {
    this.asal_daerah = asal;
  }

  public static int getCounterPetani() {
    return counterPetani;
  }
}