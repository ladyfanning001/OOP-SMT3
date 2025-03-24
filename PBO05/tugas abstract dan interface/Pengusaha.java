import java.util.Date;
import java.util.Calendar;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;
    private final int B = 3; // Ganti sesuai digit ke-13 NIM 

    public Pengusaha(String nama, Date tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public int hitungMasaKerja() {
        Calendar calNow = Calendar.getInstance();
        Calendar calMulai = Calendar.getInstance();
        calMulai.setTime(tglMulaiKerja);
        int tahun = calNow.get(Calendar.YEAR) - calMulai.get(Calendar.YEAR);
        return tahun + B;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}