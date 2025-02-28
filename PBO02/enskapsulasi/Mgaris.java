/* Nama File : Mtitik.java
* Deskripsi  : berisi atribut dan method dalam class Garis
* Pembuat    : Ladya Kalascha - 24060123140133
* Tanggal    : 20 Februari 2025
*/

public class Mgaris {
    public static void main(String[] args) {

        // 2.a Menggunakan konstruktor tanpa parameter
        garis G0 = new garis();
        System.out.println("=== Garis G0 (tanpa parameter) ===");
        G0.printGaris();
        System.out.println("Panjang garis = " + G0.panjangGaris());
        System.out.print("Persamaan garis = ");
        G0.PersamaanGaris();
        System.out.println();

        // 2.b Menggunakan konstruktor dengan parameter
        titik T1 = new titik(2, 6);
        titik T2 = new titik(8, 12);
        garis G1 = new garis(T1, T2);
        System.out.println("\n=== Garis G1 ===");
        G1.printGaris();

        // 2.c Selektor (getter) dan mutator (setter)
        System.out.println("Titik awal = " + G1.getTitikAwal().toString());
        System.out.println("Titik akhir = " + G1.getTitikAkhir().toString());

        G1.setTitikAwal(new titik(1, 3));
        G1.setTitikAkhir(new titik(4, 7));
        System.out.println("\nSetelah diubah:");
        G1.printGaris();

        System.out.println("\nCounter garis = " + garis.getCounterGaris());

        // 2.d Panjang garis
        System.out.println("\nPanjang garis = " + G1.panjangGaris());

        // 2.e Gradien
        System.out.println("Gradien garis = " + G1.gradien());

        // 2.f Titik tengah
        System.out.println("Titik tengah = " + G1.titikTengah().toString());

        // 2.g Sejajar
        garis G2 = new garis(new titik(1, 2), new titik(3, 6)); // Gradien = 2
        System.out.println("\n=== Garis G2 ===");
        G2.printGaris();
        System.out.println("Apakah G1 sejajar dengan G2? " + G1.IsSejajar(G2));

        // 2.h Tegak lurus
        garis G3 = new garis(new titik(2, 3), new titik(3, 2)); // Gradien = -1
        System.out.println("\n=== Garis G3 ===");
        G3.printGaris();
        System.out.println("Apakah G1 tegak lurus dengan G3? " + G1.IsTegakLurus(G3));

        // 2.i Cetak garis
        System.out.println("\nCetak garis G1:");
        G1.printGaris();

        // 2.j Persamaan garis
        System.out.print("\nPersamaan garis G1: ");
        G1.PersamaanGaris();
    }
}