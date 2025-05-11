/**
 * Nama : Ladya Kalascha
 * NIM : 24060123140133
 */
    
public class KoleksiAnabul {
    private Koleksi<Anabul> koleksi;

    public KoleksiAnabul(int kapasitas) {
        koleksi = new Koleksi<>(kapasitas);
    }
    
    public boolean tambahAnabul(Anabul anabul) {
        return koleksi.add(anabul);
    }

    public void showAll() {
        System.out.println("=== DAFTAR ANABUL ===");
        koleksi.showAll();
        System.out.println();
        
        // Tampilkan nama anabul
        System.out.println("=== NAMA ANABUL ===");
        for (int i = 0; i < koleksi.getSize(); i++) {
            Anabul anabul = koleksi.getIsi(i);
            System.out.println((i+1) + ". " + anabul.getNama());
        }
        System.out.println();
        
        // Tampilkan bunyi anabul
        System.out.println("=== BUNYI ANABUL ===");
        for (int i = 0; i < koleksi.getSize(); i++) {
            koleksi.getIsi(i).bersuara();
        }
        System.out.println();
        
        // Tampilkan gerakan anabul
        System.out.println("=== GERAKAN ANABUL ===");
        for (int i = 0; i < koleksi.getSize(); i++) {
            koleksi.getIsi(i).gerak();
        }
    }
}