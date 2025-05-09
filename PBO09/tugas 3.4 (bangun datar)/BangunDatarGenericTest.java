/**
 File : BangunDatarGenericTest.java
 Deskripsi : main kelas generic untuk bangun datar
 **/

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        // Lingkaran
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdgLingkaran = new BangunDatarGeneric<Lingkaran>();
        bdgLingkaran.set(l);
        System.out.println("Tipe generic: " + bdgLingkaran.get().getClass().getName());
        System.out.println("Keliling: " + bdgLingkaran.hitungKeliling());
        System.out.println("Luas: " + bdgLingkaran.hitungLuas());
        System.out.println();

        // Segitiga
        Segitiga s = new Segitiga(3, 4, 5, 4); // alas, tinggi, sisi miring, sisi ketiga
        BangunDatarGeneric<Segitiga> bdgSegitiga = new BangunDatarGeneric<Segitiga>();
        bdgSegitiga.set(s);
        System.out.println("Tipe generic: " + bdgSegitiga.get().getClass().getName());
        System.out.println("Keliling: " + bdgSegitiga.hitungKeliling());
        System.out.println("Luas: " + bdgSegitiga.hitungLuas());
        System.out.println();

        // Persegi
        Persegi p = new Persegi(5);
        BangunDatarGeneric<Persegi> bdgPersegi = new BangunDatarGeneric<Persegi>();
        bdgPersegi.set(p);
        System.out.println("Tipe generic: " + bdgPersegi.get().getClass().getName());
        System.out.println("Keliling: " + bdgPersegi.hitungKeliling());
        System.out.println("Luas: " + bdgPersegi.hitungLuas());
        System.out.println();

        // Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang(4, 6);
        BangunDatarGeneric<PersegiPanjang> bdgPP = new BangunDatarGeneric<PersegiPanjang>();
        bdgPP.set(pp);
        System.out.println("Tipe generic: " + bdgPP.get().getClass().getName());
        System.out.println("Keliling: " + bdgPP.hitungKeliling());
        System.out.println("Luas: " + bdgPP.hitungLuas());
    }
}