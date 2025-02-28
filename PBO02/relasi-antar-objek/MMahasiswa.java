/* 
* Pembuat    : Ladya Kalascha - 24060123140133
* Tanggal    : 25 Februari 2025
*/

public class MMahasiswa {
    public static void main(String[] args) {
     // Objek Mata Kuliah
     MataKuliah PBO = new MataKuliah("IF01", "PEMROGRAMAN BERBASIS OBJEK", 3);
     MataKuliah ASA = new MataKuliah("IF02", "ANALISIS DAN STRATEGI ALGORITMA", 3);
     MataKuliah BD = new MataKuliah("IF03", "BASIS DATA", 3);
     MataKuliah JARKOM = new MataKuliah("IF04", "JARINGAN KOMPUTER", 3);

     // Objek Dosen
     Dosen D1 = new Dosen("197907202003121002", "Nurdin Bahtiar, S.Si., M.T.", "Informatika");
     Dosen D2 = new Dosen("198001152005121003", "Dewi Sartika, M.Kom.", "Informatika");

     // Objek Kendaraan
     Kendaraan K1 = new Kendaraan("BD 1 A", "Motor");
     Kendaraan K2 = new Kendaraan("BD 2 B", "Mobil");
     Kendaraan K3 = new Kendaraan("BD 3 C", "Motor");

     // Objek Mahasiswa 1
     Mahasiswa M1 = new Mahasiswa("24060123140133", "Ladya Kalascha", "Informatika");
     M1.setKendaraan(K1);
     M1.setDosenWali(D1);
     M1.addMatKul(ASA);
     M1.addMatKul(PBO);

     // Objek Mahasiswa 2
     Mahasiswa M2 = new Mahasiswa("24060123140134", "Ani Mira", "Informatika");
     M2.setKendaraan(K2);
     M2.setDosenWali(D2);
     M2.addMatKul(BD);
     M2.addMatKul(PBO);
     M2.addMatKul(JARKOM);

     // Objek Mahasiswa 3
     Mahasiswa M3 = new Mahasiswa("24060123140135", "Siti Rahma", "Informatika");
     M3.setKendaraan(K3);
     M3.setDosenWali(D1);
     M3.addMatKul(ASA);
     M3.addMatKul(JARKOM);

     // Cetak Detail Mahasiswa
     System.out.println("\nDetail Mahasiswa 1:");
     M1.printDetailMhs();
     System.out.println("Jumlah SKS: " + M1.getJumlahSKS());
     System.out.println("Jumlah Mata Kuliah: " + M1.getJumlahMatKul());

     System.out.println("\nDetail Mahasiswa 2:");
     M2.printDetailMhs();
     System.out.println("Jumlah SKS: " + M2.getJumlahSKS());
     System.out.println("Jumlah Mata Kuliah: " + M2.getJumlahMatKul());

     System.out.println("\nDetail Mahasiswa 3:");
     M3.printDetailMhs();
     System.out.println("Jumlah SKS: " + M3.getJumlahSKS());
     System.out.println("Jumlah Mata Kuliah: " + M3.getJumlahMatKul());

    }


    
}
