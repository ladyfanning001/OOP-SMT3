/**
 * Nama : Ladya Kalascha
 * NIM : 24060123140133
 */
    
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI KOLEKSI ANABUL ===");
        
        
        KoleksiAnabul koleksiAnabul = new KoleksiAnabul(10);
        
        
        String[] namaKucing = {"Mimi", "Tom", "Kitty", "Whiskers", "Neko"};
        String[] namaAnjing = {"Buddy", "Rex", "Fido", "Spot", "Bobby"};
        String[] namaBurung = {"Tweety", "Rio", "Polly", "Sky", "Chirp"};
        
       
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            int tipe = random.nextInt(3);
            int namaIdx = random.nextInt(5); 
            
            Anabul anabul = null;
            switch (tipe) {
                case 0:
                    anabul = new Kucing(namaKucing[namaIdx]);
                    break;
                case 1:
                    anabul = new Anjing(namaAnjing[namaIdx]);
                    break;
                case 2:
                    anabul = new Burung(namaBurung[namaIdx]);
                    break;
            }
            
            if (anabul != null) {
                koleksiAnabul.tambahAnabul(anabul);
            }
        }
        
        koleksiAnabul.showAll();
        
        System.out.println("\n=== SIMULASI SELESAI ===");
    }
}