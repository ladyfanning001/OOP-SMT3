package PBO03;

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
      if (angka == 13) {
        throw new AngkaSialException();
      }
      System.out.println("Angka yang dimasukkan adalah " + angka + " dan bukan angka sial.");
    }
  
    public static void main(String[] args) {
      AngkaSial as = new AngkaSial(); 
      try {
        as.cobaAngka(10);
        as.cobaAngka(13);
        as.cobaAngka(12); 
      } catch (AngkaSialException ase) {
        //method getMessage() telah ada pada kelas "Exception"
        System.out.println(ase.getMessage()); 
        System.out.println("Hati-hati memasukkan angka !!!");
      }
    }
  }

  /*
Jawaban:
1. Apakah baris 12 pada AngkaSial.java dieksekusi?
   - **Ya, baris 12 dieksekusi.** Baris ini hanya membuat objek `AngkaSial` dan tidak terkait dengan eksepsi yang terjadi di dalam blok `try-catch`.

2. Apakah baris 21 pada AngkaSial.java dieksekusi?
   - **Ya, baris 21 dieksekusi.** Ketika `as.cobaAngka(13);` dipanggil, eksepsi terjadi sehingga program langsung masuk ke blok `catch`. Di dalam blok ini, baris 19 dan baris 21 dieksekusi.

Kesimpulan:
- Baris 12  Dieksekusi
- Baris 21  Dieksekusi
- Baris 16 Tidak dieksekusi karena program sudah masuk ke blok `catch` setelah eksepsi terjadi.
*/