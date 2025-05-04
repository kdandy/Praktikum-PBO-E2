import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // Inisialisasi koleksi Anabul
    ArrayList<Anabul> koleksi = new ArrayList<>();
    koleksi.add(new Kucing("Kitty", 2, "Betina", "Putih"));
    koleksi.add(new Anjing("Doggy", 3, "Jantan", "Cokelat"));
    koleksi.add(new Burung("Tweety", 1, "Betina", "Kuning"));

    // (info + aksi )
    System.out.println("=== AWALAN ");
    for (Anabul a : koleksi) {
      System.out.println(">> " + a.getNama());
      a.info();
      a.gerak();
      a.bersuara();
      a.makan();
      a.tidur();
      if (a instanceof Kucing)
        ((Kucing) a).scratch();
      else if (a instanceof Anjing)
        ((Anjing) a).fetch();
      else if (a instanceof Burung)
        ((Burung) a).terbangTinggi();
      System.out.println();
    }

    // perubahan data
    System.out.println("=== SIMULASI PERUBAHAN DATA ===");
    koleksi.get(0).setNama("Kitty Missy");
    koleksi.get(0).setUmur(3);
    koleksi.get(1).setWarna("Hitam");
    koleksi.get(2).setJenisKelamin("Jantan");
    koleksi.get(2).setUmur(2);

    // state setelah perubahan data
    System.out.println("\n=== STATE RESULTING ===");
    for (Anabul a : koleksi) {
      System.out.println(">> " + a.getNama());
      a.info();
    }

    // akhiran setelah perubahan
    System.out.println("\n=== AKHIR ===");
    for (Anabul a : koleksi) {
      System.out.println(">> " + a.getNama());
      a.gerak();
      a.bersuara();
      a.makan();
      a.tidur();
      if (a instanceof Kucing)
        ((Kucing) a).scratch();
      else if (a instanceof Anjing)
        ((Anjing) a).fetch();
      else if (a instanceof Burung)
        ((Burung) a).terbangTinggi();
      System.out.println();
    }
  }
}
