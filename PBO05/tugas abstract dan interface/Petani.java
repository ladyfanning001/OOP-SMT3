import java.util.Date;
import java.util.Calendar;

public class Petani extends Manusia implements Pajak {
    private String asalKota;
    private static int counterPetani = 0;
    private final int C = 1; // Ganti sesuai digit ke-12 NIM 

    public Petani(String nama, Date tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public int hitungMasaKerja() {
        Calendar calNow = Calendar.getInstance();
        Calendar calMulai = Calendar.getInstance();
        calMulai.setTime(tglMulaiKerja);
        int tahun = calNow.get(Calendar.YEAR) - calMulai.get(Calendar.YEAR);
        return tahun + C;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asalKota);
    }
}