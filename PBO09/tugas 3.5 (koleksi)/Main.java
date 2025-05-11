/**
 * Nama : Ladya Kalascha
 * NIM : 24060123140133
 */
    

public class Main {
    public static void main(String[] args) {
        // Membuat koleksi karakter dengan kapasitas 10
        Koleksi<Character> koleksiChar = new Koleksi<>(10);
        
        System.out.println("=== Aplikasi Koleksi Karakter ===");
        
        // Menambahkan karakter ke koleksi
        System.out.println("\nMenambahkan karakter ke koleksi...");
        koleksiChar.add('L');
        koleksiChar.add('A');
        koleksiChar.add('D');
        koleksiChar.add('Y');
        koleksiChar.add('A');
        koleksiChar.add('K');
        koleksiChar.add('L');
        koleksiChar.add('S');
        
        // Menampilkan seluruh isi koleksi
        System.out.println("\nIsi koleksi setelah penambahan:");
        koleksiChar.showAll();
        
        // Mendapatkan ukuran koleksi
        System.out.println("\nUkuran koleksi: " + koleksiChar.getSize());
        
        // Mengakses elemen tertentu
        System.out.println("\nElemen pada indeks 2: " + koleksiChar.getIsi(2));
        
        // Mengubah elemen
        System.out.println("\nMengubah elemen pada indeks 4 dari '" + 
                          koleksiChar.getIsi(4) + "' menjadi 'X'");
        koleksiChar.setIsi(4, 'X');
        
        // Menampilkan koleksi setelah perubahan
        System.out.println("\nIsi koleksi setelah perubahan:");
        koleksiChar.showAll();
        
        // Menghapus elemen
        char deleted = koleksiChar.delete(3);
        System.out.println("\nMenghapus karakter '" + deleted + "' pada indeks 3");
        
        // Menampilkan koleksi setelah penghapusan
        System.out.println("\nIsi koleksi setelah penghapusan:");
        koleksiChar.showAll();
        
        // Menambah elemen lagi
        System.out.println("\nMenambah karakter 'Z' dan 'Y'");
        koleksiChar.add('Z');
        koleksiChar.add('Y');
        
        // Menampilkan koleksi final
        System.out.println("\nIsi koleksi final:");
        koleksiChar.showAll();
    }
}