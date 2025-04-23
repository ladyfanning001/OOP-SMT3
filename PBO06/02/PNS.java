import java.util.Date;
import java.util.Calendar;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;
    private final int A = 3; // Ganti sesuai digit ke-14 NIM 

    public PNS(String nama, Date tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    @Override
    public int hitungMasaKerja() {
        Calendar calNow = Calendar.getInstance();
        Calendar calMulai = Calendar.getInstance();
        calMulai.setTime(tglMulaiKerja);
        int tahun = calNow.get(Calendar.YEAR) - calMulai.get(Calendar.YEAR);
        return tahun + A;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}