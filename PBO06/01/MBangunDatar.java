/* 
  Nmaa/NIM   : Ladya Kalascha/24060123140133
  Tanggal   : 21 Maret 2025
*/

public class MBangunDatar {
    public static void main(String[] args) {

   

        // BAGIAN 1 - Pembuatan Objek dan Demonstrasi Abstract Class
        System.out.println("Membuat Objek Bangun Datar\n");

        // Pembuatan objek menggunakan polimorfisme
        BangunDatar bd1 = new Persegi(8, "Biru", "Solid");
        BangunDatar bd2 = new Lingkaran(6, "Hijau", "Dotted");

        // Pembuatan objek langsung sesuai kelasnya
        Persegi ps1 = new Persegi(4, "Merah", "Dashed");
        Lingkaran lg1 = new Lingkaran(12, "Kuning", "Double");

        // Menampilkan detail objek
        System.out.println(">> Detail Persegi (bd1 - referensi BangunDatar)");
        bd1.printInfo();
        System.out.println("Luas: " + bd1.getLuas());
        System.out.println("Keliling: " + bd1.getKeliling());

        System.out.println("\n>> Detail Lingkaran (bd2 - referensi BangunDatar)");
        bd2.printInfo();
        System.out.println("Luas: " + bd2.getLuas());
        System.out.println("Keliling: " + bd2.getKeliling());

        System.out.println("\n>> Detail Persegi (ps1 - referensi Persegi)");
        ps1.printInfo();
        System.out.println("Luas: " + ps1.getLuas());
        System.out.println("Keliling: " + ps1.getKeliling());
        System.out.println("Diagonal: " + ps1.getDiagonal());

        System.out.println("\n>> Detail Lingkaran (lg1 - referensi Lingkaran)");
        lg1.printInfo();
        System.out.println("Luas: " + lg1.getLuas());
        System.out.println("Keliling: " + lg1.getKeliling());

        // Perbandingan Luas dan Keliling
        System.out.println("\nMembandingkan Luas dan Keliling Bangun Datar\n");

        // Objek-objek perbandingan
        double sisiPs2 = Math.sqrt(Math.PI * 3.0 * 3.0);
        Persegi ps2 = new Persegi(sisiPs2, "Putih", "Solid");

        double diameterLg2 = 2 * Math.sqrt(64 / Math.PI);
        Lingkaran lg2 = new Lingkaran(diameterLg2, "Abu-abu", "Dotted");

        double sisiPs3 = (Math.PI * 12) / 4;
        Persegi ps3 = new Persegi(sisiPs3, "Coklat", "Dashed");

        double diameterLg3 = 16 / Math.PI;
        Lingkaran lg3 = new Lingkaran(diameterLg3, "Pink", "Double");

        // Cek Luas
        System.out.println("Cek Kesamaan Luas:");
        System.out.println("bd1 dan ps1: " + bd1.isEqualLuas(ps1));
        System.out.println("bd1 dan bd2: " + bd1.isEqualLuas(bd2));
        System.out.println("ps2 kira-kira sama dengan bd2: " + ps2.isEqualLuas(bd2));
        System.out.println("bd1 kira-kira sama dengan lg2: " + bd1.isEqualLuas(lg2));

        // Cek Keliling
        System.out.println("\nCek Kesamaan Keliling:");
        System.out.println("ps1 dan lg3: " + ps1.isEqualKeliling(lg3));
        System.out.println("bd1 dan bd2: " + bd1.isEqualKeliling(bd2));
        System.out.println("ps3 kira-kira sama dengan lg1: " + ps3.isEqualKeliling(lg1));

        // Verifikasi Nilai
        System.out.println("\nNilai Luas dan Keliling:");
        System.out.println("Luas ps2: " + ps2.getLuas());
        System.out.println("Luas lg2: " + lg2.getLuas());
        System.out.println("Keliling ps3: " + ps3.getKeliling());
        System.out.println("Keliling lg3: " + lg3.getKeliling());

        // BAGIAN 3 - Demonstrasi Interface IResize
        System.out.println("\nUji Fitur Resize (IResize)\n");

        // Uji pada persegi
        System.out.println("Resize Persegi ps1");
        System.out.println("Sisi awal: " + ps1.getSisi());
        ps1.zoomIn();
        System.out.println("Setelah zoomIn - Sisi: " + ps1.getSisi());
        ps1.zoomOut();
        System.out.println("Setelah zoomOut - Sisi: " + ps1.getSisi());
        ps1.zoom(150);
        System.out.println("Setelah diperbesar 1.5x - Sisi: " + ps1.getSisi());

        // Uji pada lingkaran
        System.out.println("\nResize Lingkaran lg1");
        System.out.println("Jari-jari awal: " + lg1.getJariJari());
        lg1.zoomIn();
        System.out.println("Setelah zoomIn - Jari-jari: " + lg1.getJariJari());
        lg1.zoomOut();
        System.out.println("Setelah zoomOut - Jari-jari: " + lg1.getJariJari());
        lg1.zoom(200);
        System.out.println("Setelah diperbesar 2x - Jari-jari: " + lg1.getJariJari());

        // Uji menggunakan interface
        System.out.println("\nResize via Interface IResize");
        IResize resPersegi = ps1;
        IResize resLingkaran = lg1;

        resPersegi.zoom(50); // diperkecil 50%
        System.out.println("Setelah diperkecil - Sisi ps1: " + ps1.getSisi());

        resLingkaran.zoom(75); // diperkecil 25%
        System.out.println("Setelah diperkecil - Jari-jari lg1: " + lg1.getJariJari());

      
    }
}