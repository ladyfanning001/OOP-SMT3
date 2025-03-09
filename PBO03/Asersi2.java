package PBO03;

/** 
 * File : Asersi2.java
 * Deskripsi : Program untuk demo asersi yang akan menolak input jari-jari lingkaran bernilai nol
 * Nama/NIM : Ladya Kalascha/24060123140133
 * 
*/

class Lingkaran {
    private double jariJari;
  
    public Lingkaran(double jariJari) {
      this.jariJari = jariJari;
    }
  
    public double hitungKeliling() {
      return 2 * Math.PI * jariJari;
    }
  }
  public class Asersi2 {
    public static void main(String[] args) {
      double jariJari = 0;
      assert (jariJari > 0) : "jari-jari tidak boleh nol!!!";
      Lingkaran l = new Lingkaran(jariJari); 
      double kelilingLingkaran = l.hitungKeliling();
      System.out.println("Keliling lingkaran = " + kelilingLingkaran); 
    }
  }

  /*
Jawaban:

1. Asersi (`assert`) tidak selalu aktif**
   - Asersi hanya berjalan jika program dijalankan dengan flag `-ea` (enable assertions). Jika tidak, kode asersi akan dilewati, sehingga program tetap berjalan meskipun `jariJari = 0`.
   - Solusi yang lebih aman adalah menggunakan `if-else` atau melempar `IllegalArgumentException` agar validasi tetap dilakukan.

2. Objek `Lingkaran` tetap dibuat sebelum asersi dicek**
   - Jika `jariJari == 0`, asersi akan gagal, tetapi objek `Lingkaran` sudah dibuat terlebih dahulu. Ini kurang tepat karena validasi seharusnya dilakukan sebelum objek dibuat.

3. **Asersi bukan cara yang tepat untuk validasi input**
   - `assert` lebih cocok digunakan untuk memastikan kondisi yang "seharusnya tidak mungkin salah" dalam program, seperti debugging.
   - Untuk validasi input, lebih baik menggunakan pengecekan eksplisit seperti ini:
     ```java
     if (jariJari <= 0) {
         throw new IllegalArgumentException("Jari-jari tidak boleh nol atau negatif!");
     }
     ```
*/ 