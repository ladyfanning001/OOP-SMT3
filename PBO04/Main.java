import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Membuat objek DosenTetap
        DosenTetap dosenTetap = new DosenTetap(
            "9545647548", "Andi", LocalDate.of(1990, 5, 5),
            LocalDate.of(2015, 1, 1), 5000000,
            "Fakultas Sains dan Matematika", "78647324"
        );

        // Membuat objek DosenTamu
        DosenTamu dosenTamu = new DosenTamu(
            "1234567890", "Budi", LocalDate.of(1985, 10, 15),
            LocalDate.of(2020, 7, 1), 6000000,
            "Fakultas Teknik", "99887766", LocalDate.of(2026, 12, 31)
        );

        // Membuat objek Tendik
        Tendik tendik = new Tendik(
            "9876543210", "Citra", LocalDate.of(1992, 3, 20),
            LocalDate.of(2018, 2, 10), 4000000, "Akademik"
        );

        // Menampilkan informasi masing-masing pegawai
        System.out.println("=== Informasi Dosen Tetap ===");
        dosenTetap.printInfo();
        System.out.println();

        System.out.println("=== Informasi Dosen Tamu ===");
        dosenTamu.printInfo();
        System.out.println();

        System.out.println("=== Informasi Tendik ===");
        tendik.printInfo();
    }
}