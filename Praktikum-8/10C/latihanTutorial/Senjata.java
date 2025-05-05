/*
 * Nama File    : Senjata.java
 * Deskripsi    : Kelas Senjata yang merepresentasikan senjata
 * Pembuat      : Dandy Faishal Fahmi 24060123140136
 * Tanggal      : 01 Mei 2025
*/

package latihanTutorial;
public class Senjata {
  private String bunyi;
  private boolean menusuk;

  public Senjata(String bunyi) {
    this.bunyi = bunyi;
    this.menusuk = false;
  }

  private String getBunyi() {
    return bunyi;
  }

  private void setBunyi(String bunyi) {
    this.bunyi = bunyi;
  }

  private boolean isMenusuk() {
    return menusuk;
  }

  private void setMenusuk(boolean menusuk) {
    this.menusuk = menusuk;
  }

  public void menembak(int jumlah) {
    for (int i = 0; i < jumlah; i++) {
      System.out.print(getBunyi() + " ");
    }
    System.out.println();
  }

  public void pasangBayonet() {
    setMenusuk(true);
    System.out.println("Bayonet Terpasang");
  }

  public String menusuk() {
    if (isMenusuk()) {
      return "Dor!";
    } else {
      return "Gagal, belum pasang bayonet";
    }
  }
}
